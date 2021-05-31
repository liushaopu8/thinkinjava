//: chapter03_operators/E09_MinMaxExponents.java
/********************************************
 * Display the largest and smallest numbers for
 * both float and double exponential notation.
 ********************************************/
package com.shao.think.chapter03_operators;

public class E09_MinMaxExponents {
    public static void main(String[] args){
        System.out.println("Float MIN_VALUE: " + Float.MIN_VALUE);
        System.out.println("Float MIN_NORMAL: " + Float.MIN_NORMAL);
        System.out.println("Float MIN_EXPONENT: " + Float.MIN_EXPONENT);
        System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Float MAX_EXPONENT: " + Float.MAX_EXPONENT);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double MIN_NORMAL: " + Double.MIN_NORMAL);
        System.out.println("Double MIN_EXPONENT: " + Double.MIN_EXPONENT);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double MAX_EXPONENT: " + Double.MAX_EXPONENT);
    }
}/* Output:
Float MIN_VALUE: 1.4E-45
Float MIN_NORMAL: 1.17549435E-38
Float MIN_EXPONENT: -126
Float MAX_VALUE: 3.4028235E38
Float MAX_EXPONENT: 127
Double MIN_VALUE: 4.9E-324
Double MIN_NORMAL: 2.2250738585072014E-308
Double MIN_EXPONENT: -1022
Double MAX_VALUE: 1.7976931348623157E308
Double MAX_EXPONENT: 1023
*///:~
