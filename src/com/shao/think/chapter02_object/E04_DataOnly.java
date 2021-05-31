//:chapter02_object/E04_DataOnly
/***************Exercise 4 ******************
 * Turn the DataOnly  code fragments
 * into a program that compiles and runs
 ********************************************/
package com.shao.think.chapter02_object;

public class E04_DataOnly {
    int i ;
    double d;
    boolean b;
    public static void main(String[] args){
        E04_DataOnly d = new E04_DataOnly();
        d.i = 47;
        System.out.println("d.i = " + d.i);
        d.d = 1.1;
        System.out.println("d.d = " + d.d);
        d.b = false;
        System.out.println("d.b = " + d.b);
    }
} ///:~
