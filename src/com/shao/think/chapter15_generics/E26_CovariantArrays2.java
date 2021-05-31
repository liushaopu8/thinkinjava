//: chapter15_generics/.java
/*************** Exercise 26 *******************
 * Demonstrate array covariance using Numbers and
 * Integers.
 **********************************************/
package com.shao.think.chapter15_generics;

public class E26_CovariantArrays2 {
    public static void main(String args[]){
        Number[] nums = new Integer[10];
        nums[0] = Integer.valueOf(1);
        nums[1] = new Float(1.0);
        nums[2] = Byte.valueOf((byte)1);
    }
}   /*  Output:
java.lang.ArrayStoreException: java.lang.Float
java.lang.ArrayStoreException: java.lang.Byte
 *///:~
