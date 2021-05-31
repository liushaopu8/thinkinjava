//: chapter05_initialization/ObjectReferences.java
/****************** Exercise 17 *******************
 * Create a class with a constructor that takes a String
 * argument During construction, print the argument.
 * Create an array of object references to this class,
 * with or without create objects to assign into the
 * array. When you run the program, notice when the
 * initialization messages from constructor calls are printed
 **************************************************/
package com.shao.think.chapter05_initialization;
class Test{
    Test(String s){
        System.out.println("String constructor: s = " + s);
    }
}
public class ObjectReferences {
    Test[] array1 = new Test[5];
    public static void main(String args[]){
        Test[] array2 = new Test[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Test(Integer.toString(i));
        }
    }
}/* Output:
String constructor: s = 0
String constructor: s = 1
String constructor: s = 2
String constructor: s = 3
String constructor: s = 4

*///: ~
