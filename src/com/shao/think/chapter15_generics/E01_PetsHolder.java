//: chapter15_generics/E01_PetsHolder.java
/*************** Exercise 01 *******************
 *  Use Holder3 with the chapter14_typeinfo.pets library to
 *  show that a Holder3 that is specified to hold
 *  a base type can also hold a derived type.
 **********************************************/
package com.shao.think.chapter15_generics;


import com.shao.think.chapter15_generics.holder.Automombile;

class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automombile> h3 = new Holder3<>(new Automombile());
        Automombile a = h3.get();// No cast needed
//        h3.set("Not an Automobile");//can't be applied to java.long.String
//        h3.set(1);//can't be applied to java.long.String
    }
}

public class E01_PetsHolder {
    public static void main(String args[]){
//        Holder3<Pet> h3 = new Holder3<Pet>();
    }
}   /*  Output:
 *///:~
