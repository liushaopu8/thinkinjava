//: chapter15_generics/.java
/*************** Exercise 21 *******************
 * Modify ClassTypeCapture.java by adding a
 * Map<String,Class<?>>, a method
 * addType(String typename, Class<?> kind), and
 * a method createNew(String typename). createNew()
 * will either produce a new instance of the class
 * associated with its argument string, or produce
 * an error message.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.util.HashMap;
import java.util.Map;

class ClassTypeCapture2{
    Map<String,Class<?>> types = new HashMap<String, Class<?>>();
    public Object createNew(String typename){
        Class<?> cl = types.get(typename);
        try {
            cl.newInstance();
        } catch (InstantiationException e) {
            Print.print("Not a registered typename: " + typename);
        } catch (IllegalAccessException e) {
            Print.print(e.toString());
        }
        return null;
    }

    public void addType(String typename, Class<?> kind){
        types.put(typename, kind);
    }
}
class Building {
}

class House {
}

class Product {
}
public class E21_ClassTypeCapture2 {
    public static void main(String args[]){
        ClassTypeCapture2 ctt = new ClassTypeCapture2();
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Product", Product.class);
//        Print.print(ctt.createNew("Building").getClass());
//        ctt.createNew("Product");
//        ctt.createNew("Car");
    }

}   /*  Output:d
 *///:~
