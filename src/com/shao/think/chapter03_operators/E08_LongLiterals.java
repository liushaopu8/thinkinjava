//: chapter03_operators/E08_LongLiterals.java
/***************Exercise 8 ******************
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results
 *******************************************/
package com.shao.think.chapter03_operators;

public class E08_LongLiterals {
    public static void main(String[] args){
        long l1 = 0x2f, l2 = 0x2F, l3 = 017;
        System.out.println("l1: " + Long.toBinaryString(l1));
        System.out.println("l2: " + Long.toBinaryString(l2));
        System.out.println("l3: " + Long.toBinaryString(l3));
    }
}/* Output:
l1: 101111
l2: 101111
l3: 1111
*///:~
