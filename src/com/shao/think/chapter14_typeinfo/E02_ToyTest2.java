//: chapter14_typeinfo/E02_ToyTest2.java
/***********************************************
 * Incorporate a new kind of interface into ToyTest.java
 * and verify that it is detected and displayed properly
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

interface HasCPU {}
class FancierToy extends FancyToy implements HasCPU{}

public class E02_ToyTest2 {
    static void printInfo(Class<?> cc){
        Print.print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        Print.print("Simple name: " + cc.getSimpleName());
        Print.print("Canonical name: " + cc.getCanonicalName());
    }
    public static void main(String [] args){
        Class<?> c = null;
        try {
            c = Class.forName("com.shao.think.chapter14_typeinfo.FancierToy");
        } catch (ClassNotFoundException e) {
            Print.print("Can't find FancierToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class<?> face: c.getInterfaces())
            printInfo(face);

        Class<?> superclass = c.getSuperclass();
        Object obj = null;
        try {
            obj = superclass.newInstance();
        } catch (InstantiationException e) {
            Print.print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            Print.print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}   /*  Output:
Class name: com.shao.think.chapter14_typeinfo.FancierToy is interface? [false]
Simple name: FancierToy
Canonical name: com.shao.think.chapter14_typeinfo.FancierToy
Class name: com.shao.think.chapter14_typeinfo.HasCPU is interface? [true]
Simple name: HasCPU
Canonical name: com.shao.think.chapter14_typeinfo.HasCPU
Class name: com.shao.think.chapter14_typeinfo.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name: com.shao.think.chapter14_typeinfo.FancyToy
 *///:~
