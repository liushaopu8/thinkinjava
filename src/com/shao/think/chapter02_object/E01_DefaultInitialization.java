//::chapter02_object/E01_DefaultInitialization
/********************Exercise 1 ******************
 * Create a class containg an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ************************************************/
package com.shao.think.chapter02_object;

public class E01_DefaultInitialization {
    int i;
    char c;
    public E01_DefaultInitialization(){
        System.out.println("i = " + i);
        System.out.println("c = [" + c + "]");
    }
    public static void main(String[] args){
        new E01_DefaultInitialization();
    }
}/* Output:
i = 0
c = [ ]
*///~
