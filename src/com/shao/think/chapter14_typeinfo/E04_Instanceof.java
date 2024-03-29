//: chapter14_typeinfo/E04_Instanceof.java
/***********************************************
 * Modify the previous exercise so that it uses
 * instanceof to check the type before performing
 * the downcast.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

public class E04_Instanceof {
    public static void main(String [] args){
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid) shape;
        // Test before Downcasting
        Circle c = null;
        if(shape instanceof Circle)
            c = (Circle) shape;
        else
            System.out.println("shape not a Circle");
    }
}   /*  Output:
shape not a Circle
 *///:~
