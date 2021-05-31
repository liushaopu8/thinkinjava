//: chapter14_typeinfo/E01_ToyTest.java
/***********************************************
 * In ToyTest.java, comment out Toy's default constructor
 * and explain what happens.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
//    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements
        HasBatteries,Waterproof, Shoots{
    FancyToy(){ super(1); }
}

public class E01_ToyTest {
    static void printInfo(Class<?> cc){
        Print.print("Class name: " + cc.getName() +
        " is interface? [" + cc.isInterface() + "]");
        Print.print("Simple name: " + cc.getSimpleName());
        Print.print("Canonical name: " + cc.getCanonicalName());
    }
    public static void main(String [] args){
        Class<?> c = null;
        try{
            c = Class.forName("com.shao.think.chapter14_typeinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            Print.print("Can't find FancyToy");
            return ;
        }
        printInfo(c);
        for(Class<?> face: c.getInterfaces())
            printInfo(face);
        Class<?> up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            Print.print("Cannot instantiate");
            return;
        } catch (IllegalAccessException e) {
            Print.print("Cannot access");
            return;
        }
        Print.print(obj.getClass());
    }
}   /*  Output:
Class name: com.shao.think.chapter14_typeinfo.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name: com.shao.think.chapter14_typeinfo.FancyToy
Class name: com.shao.think.chapter14_typeinfo.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name: com.shao.think.chapter14_typeinfo.HasBatteries
Class name: com.shao.think.chapter14_typeinfo.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name: com.shao.think.chapter14_typeinfo.Waterproof
Class name: com.shao.think.chapter14_typeinfo.Shoots is interface? [true]
Simple name: Shoots
Canonical name: com.shao.think.chapter14_typeinfo.Shoots
Cannot instantiate

note that you must define the required default constructor for up.newInstance();
the compiler can't create it because a non-default constructor always exists.
 *///:~
