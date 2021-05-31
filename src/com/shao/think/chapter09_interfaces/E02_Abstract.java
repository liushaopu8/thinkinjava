//:chapter09_interfaces/E02_Abstract.java
//{CompileTimeError}
/***************** Exercise 02 ********************
* Create a class as abstract without including any
 * abstract methods, and verify that you cannot create
 * any instances of that class.
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

abstract class NoAbstractMethods{
    void f(){
        Print.print("f()");
    }
}
public class E02_Abstract {
    public static void main(String[] args){
        //NoAbstractMethods is abstract, cannot be instantiated
//        new NoAbstractMethods();
    }
}/* Output:
*///:~
