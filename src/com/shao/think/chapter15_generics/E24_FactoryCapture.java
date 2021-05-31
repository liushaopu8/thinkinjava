//: chapter15_generics/.java
/*************** Exercise 24 *******************
 * Modify Exercise 21 so that factory objects are
 * held in the Map instead of Class<?>.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.util.HashMap;
import java.util.Map;

class FactoryCapture {
    Map<String, FactoryI<?>> factories =
            new HashMap<String, FactoryI<?>>();

    public void addFactory(String factoryname,FactoryI<?> factory) {
        factories.put(factoryname,factory);
    }

    public Object createNew(String factoryname, int arg) {
        FactoryI<?> f = factories.get(factoryname);
        return  f.create(arg);
    }
}
public class E24_FactoryCapture {
    public static void main(String args[]){
        FactoryCapture fc = new FactoryCapture();
        fc.addFactory("Integer", new IntegerFactory());
        fc.addFactory("Widget",new Widget.Factory());
        Print.print(fc.createNew("Integer",1));
        Print.print(fc.createNew("Widget",2));
        fc.createNew("Product", 3);
    }
}   /*  Output:
 *///:~
