package com.shao.think.util;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<?>,Integer> {
    private final Class<?> baseType;

    public TypeCounter(Class<?> baseType){
        this.baseType = baseType;
    }
    public void count(Object oj){
        Class<?> type = oj.getClass();
        if(!baseType.isAssignableFrom(type))
            throw new RuntimeException(oj + " inocrrect type: "
             + type + ", should be type or subtype of  " + baseType);
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null? 1 : quantity +1);
        Class<?> superclass = type.getSuperclass();
        if(superclass != null &&
                baseType.isAssignableFrom(superclass))
            countClass(superclass);
    }

    public String toString(){
        StringBuilder result = new StringBuilder("{");
        for(Map.Entry<Class<?>,Integer> pair: entrySet()){
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());
        result.append("}");
        return result.toString();
    }
}
