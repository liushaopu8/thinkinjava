//: chapter14_typeinfo/E20_ClassDump.java
// { Args: java.lang.String tpeinfo.SuperToy}
/***********************************************
 * Look up the interface for java.lang.Class in
 * the JDK documentation from jva.sun.com.
 * Write a program that takes the name of a class
 * as a command-line argument, then uses the
 * Class methods to dump all the information
 * available for that class. Test your program
 * with a standard library class and a class you
 * create.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

public class E20_ClassDump {
    public static void display(String msg, Object[] vals){
        Print.print(msg);
        for(Object val : vals)
            Print.print("   " + val);
    }
    public static void classInfo(Class<?> c) {
        Print.print("c.getName(): " + c.getName());
        Print.print("c.getPackage() : " + c.getPackage());
        Print.print("c.getSuperclass(): " + c.getSuperclass());
        display("c.getDeclaredClasses() : " , c.getDeclaredClasses());
        display("c.getClasses() : " , c.getClasses());
        display("c.getInterfaces() : " , c.getInterfaces());
        display("c.getDeclaredMethods() : " , c.getDeclaredMethods());
        display("c.getMethods() : " , c.getMethods());
        display("c.getDeclaredConstructors() : " , c.getDeclaredConstructors());
        display("c.getConstructors() : " , c.getConstructors());
        display("c.getDeclaredFields() : " , c.getDeclaredFields());
        display("c.getFields() : " , c.getFields());
        if(c.getSuperclass() != null){
            Print.print("Base class: -----");
            classInfo(c.getSuperclass());
        }

    }

    public static void main(String [] args){

            try {
                classInfo(Class.forName("com.shao.think.chapter14_typeinfo.E20_ClassDump"));
                for(String arg : args) {
                    classInfo(Class.forName(arg));
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

    }
}   /*  Output:
 *///:~
