//: chapter05_initialization/FinalizeAlwaysCalled.java
/****************** Exercise 11 *******************
 * finalize() will always be called
 **************************************************/
package com.shao.think.chapter05_initialization;

public class FinalizeAlwaysCalled {
    protected void finalize(){
        System.out.println("finalize() called");
    }

    public static void main(String args[]){
        new FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
} /*  Output:
finalize() called
*///: ~
