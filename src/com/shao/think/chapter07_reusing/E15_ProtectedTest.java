//: chapter07_reusing/E15_ProtectedTest.java
/****************** Exercise 15 *******************
 * Create a class with a protect method method
 * inside a package. Try to call the protect method
 * outside the package, and explain the results. Now
 * inherit from your calss and call the protect method
 * from inside a method of your derived class.
 ************************************************/
package com.shao.think.chapter07_reusing;

import com.shao.think.chapter07_reusing.protect.E15_Protected;

class Derived extends E15_Protected{
    public void g(){
        f();
    }
}


public class E15_ProtectedTest {
    public void main(String[] args){
//        new E15_Protected().f();
        new Derived().g();
    }
}///:~

//Outside the package, you can only access a protected member inside an inherited calss
