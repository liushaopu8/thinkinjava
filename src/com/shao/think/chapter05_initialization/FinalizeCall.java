//: chapter05_initialization/FinalizeCall.java
/****************** Exercise 10 *******************
 * Create a class with a finialize() method that
 * prints a message. In main(), create an object
 * of our class. Explain the behavior of your program
 **************************************************/
package com.shao.think.chapter05_initialization;

public class FinalizeCall {
    protected void finalize(){
        System.out.println("finalize() called");
    }

    public static void main(String args[]){
        new FinalizeCall();
    }
} ///: ~
