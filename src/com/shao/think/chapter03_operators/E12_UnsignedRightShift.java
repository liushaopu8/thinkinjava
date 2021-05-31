//: chapter03_operators/E12_UnsignedRightShift.java
/****************Exercise 12 ***************
 *
 ******************************************/
package com.shao.think.chapter03_operators;

public class E12_UnsignedRightShift {
    public static void main(String[] args){
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 1; System.out.println(Integer.toBinaryString(i));
    }
} /* Output:
*///: ~
