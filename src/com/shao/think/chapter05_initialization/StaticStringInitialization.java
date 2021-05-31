//: chapter05_initialization/StaticStringInitialization.java
/****************** Exercise 14 *******************
 * Create a class with a static String field that
 * is initialized at the point of definition, and
 * another one initialized by the static block.
 * Add a static method that prints both fields and
 * demonstrates that they are both initialized
 * before they are used.
 **************************************************/
package com.shao.think.chapter05_initialization;

public class StaticStringInitialization {
    static String s1;
    static String s2 = "Initialized at definition";
    String s3;
    {s3 = " 'instance initialization' ";}
    static { s1 = "Initialized in static block" ;}
    public static void main(String args[]){
        System.out.println("s1 = " + StaticStringInitialization.s1);
        System.out.println("s2 = " + StaticStringInitialization.s2);
        System.out.println("s3 = " + new StaticStringInitialization().s3);
    }
} /*  Output:
s1 = Initialized in static block
s2 = Initialized at definition
s3 =  'instance initialization'
*///: ~
