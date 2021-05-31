//: chapter05_initialization/ThisConstructorCall.java
/********************* Exercise 9 *******************
 * Create a calss with two (overloaded) constructors.
 * Using this, call the second constructor inside the
 * first one
****************************************************/

 package com.shao.think.chapter05_initialization;

public class ThisConstructorCall {
    public ThisConstructorCall(String s){
        System.out.println("s = " + s);
    }

    public ThisConstructorCall(int i){
        this("i = " + i);
    }

    public static void main(String[] args){
        new ThisConstructorCall("String call");
        new ThisConstructorCall(47);
    }
} /* Output:
s = String call
s = i = 47
*///:~
