//: operators/E01_PrintStatements.java
/************************ Exercise 1 ******************
 * Write a program that uses the "short" and
 *  normal form of print statement
 ******************************************************/
package com.shao.think.chapter03_operators;
//import static net.mindview.util.Print.*;

import java.util.Date;

public class E01_PrintStatements {
    public static void main(String[] args){
        Date currDate = new Date();
        System.out.println("Hello, it's: " + currDate);
    }
}/* Output :(Sample)
Hello, it's: Fri Apr 16 06:20:14 GMT+08:00 2021
*///:~
