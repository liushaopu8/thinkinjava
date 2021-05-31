//:chapter09_interfaces/E17_ImplicitStaticFinal.java
/***************** Exercise 17 ********************
 * Prove that the fields in an interface are implicitly
 * static and final
 **************************************************/
package com.shao.think.chapter09_interfaces;

import javax.swing.text.SimpleAttributeSet;

interface StaticFinalTest{
    String RED = "Red";
}

class Test implements StaticFinalTest{
    public Test(){
        /**
         *  cannot assign a value to a final variable
         */
//        RED = "Blue";
    }
}

public class E17_ImplicitStaticFinal {
    public static void main(String[] args){
        //Accessing as a static field
        System.out.println("StaticFinalTest.RED = " + StaticFinalTest.RED);
    }
}/* Output:
StaticFinalTest.RED = Red
*///:~
