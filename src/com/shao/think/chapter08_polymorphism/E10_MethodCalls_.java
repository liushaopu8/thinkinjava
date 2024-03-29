//:chapter08_polymorphism/E10_MethodCalls_.java
/*************  Exercise 10 ******************
 * Create a base class with two methods. In the
 * first method, call the second method. Inherit
 * a class and override the second method. Create
 * an object of the derived class, upcast it to
 * the base type, and call the first method.
 * Explain what happens
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.util.Print;

class TwoMethods{
    public void m1(){
        System.out.println("Inside m1, calling m2");
        m2();
    }

    private void m2() {
        System.out.println("Inside m2");
    }
}

class Inherited extends TwoMethods {
    public void m2(){
        System.out.println("Inside Inherited m2");
    }
}

public class E10_MethodCalls_ {
    public static void main(String args[]){
        TwoMethods x = new Inherited();
        x.m1();
    }
}   /* Outpu:

*///:~
