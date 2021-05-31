//: chapter14_typeinfo/E08_RecursiveClassPrint.java
/***********************************************
 * Write a method that takes an object and recursively
 * prints all the classes in that object's hierarchy
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

public class E08_RecursiveClassPrint {
    static void printClasses(Class<?> c){
        if(c == null) return;
        Print.print(c.getName());
        for(Class<?> k : c.getInterfaces()){
            Print.print("Interface: " + k.getName());
            Print.print(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }
    public static void main(String [] args){
            try {
                printClasses(Class.forName("java.util.ArrayList"));
                for (int i = 0; i < args.length; i++) {
                        Print.print("Display: " + args[i]);
                        printClasses(Class.forName(args[i]));
                        if(i < args.length-1)
                            Print.print("=================================");
                    }
                } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


    }
}   /*  Output:
 *///:~
