//: chapter15_generics/.java
/*************** Exercise 31 *******************
 * Remove all the generics from MultipleInterfaceVariants.java
 * and modify the code so that the example compiles
 **********************************************/
package com.shao.think.chapter15_generics;

interface Payable{}

class Employee implements Payable{}

class Hourly extends Employee implements Payable{}

public class E31_MultipleInterfaceVaraiants2 {
    public static void main(String args[]){
        new Employee();
        new Hourly();
    }
}   /*  Output:
 *///:~
