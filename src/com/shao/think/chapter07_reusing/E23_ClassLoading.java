//: chapter07_reusing/.java
/****************** Exercise 23 ******************
 * Prove that class loading takes place only once
 * and may be caused by either the creation of the
 * first instance of that class or by accessing a
 * static member.
 ************************************************/
package com.shao.think.chapter07_reusing;

class LoadTest {
    // The static clause is executed upon class loading:
    static {
        System.out.println("Loading LoadTest");
    }
    static void staticMember(){}
}
public class E23_ClassLoading {
    public static void main(String args[]){
        System.out.println("Calling static member");
        LoadTest.staticMember();
        System.out.println("Create an object");
        new LoadTest();
    }
}/* Output:
Calling static member
Loading LoadTest
Create an object
*///:~
