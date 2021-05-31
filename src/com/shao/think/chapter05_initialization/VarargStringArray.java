//: chapter05_initialization/VarargStringArray.java
/****************** Exercise 19 *******************
 *
 **************************************************/
package com.shao.think.chapter05_initialization;

public class VarargStringArray {
    static void printStrings(String...strs){
        for(String s: strs){
            System.out.print(s);
        }
    }
    public static void main(String args[]){
        printStrings("These", "are", "comma-separated", " list of strings");
        System.out.println();
        printStrings(new String[] {"These", " are", " some", " strings"," array"});
        if(args.length > 0){
            printStrings(args);
        }
    }
}/* Output:
Thesearecomma-separated list of strings
These are some strings array
*///: ~
