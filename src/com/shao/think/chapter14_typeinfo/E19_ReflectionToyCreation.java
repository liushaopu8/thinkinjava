//: chapter14_typeinfo/E19_ReflectionToyCreation.java
/***********************************************
 * In ToyTest.java, use reflection to create a
 * Toy object using the nondefault constructor.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SuperToy extends FancierToy{
        int IQ;
        public SuperToy(int intelligence){
            IQ = intelligence;
        }
        public String toString(){
            return "I'm a SuperToy. I'm smarter than you.";
        }
}

public class E19_ReflectionToyCreation {
    public static Toy makeToy(String toyName, int IQ){
        try {
            Class<?> tClass = Class.forName(toyName);
            for(Constructor<?> ctor : tClass.getConstructors()){
                Class<?>[] params = ctor.getParameterTypes();
                if(params.length == 1)
                    if(params[0] == int.class) {
                        try {
                            return (Toy)ctor.newInstance(
                                    new Object[]{Integer.valueOf(IQ)});
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String [] args){
        System.out.println(makeToy("com.shao.think.chapter14_typeinfo.SuperToy",150));
    }
}   /*  Output:
 *///:~
