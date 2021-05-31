//:chapter09_interfaces/E04_AbstractBase.java
/***************** Exercise 04 ********************
 * Create an abstract class with no methods. Derive
 * a class and add a method. Create a static method
 * that downcasts a reference from the base class to
 * the derived class and calls the method. Demonstrate
 * that it works in main(). Eliminate the need for
 * the downcast by moving the abstract declaration to
 * the base class
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

abstract class NoMethods{}

abstract class WithMethods{
    abstract public void f();
}

class Extended1 extends NoMethods{
    public void f(){
        Print.print("Extended1.f");
    }
}

class Extended2 extends WithMethods{
    public void f(){
        Print.print("Extended2.f");
    }
}
public class E04_AbstractBase {
    public static void main(String[] args){
        NoMethods nm = new Extended1();
        ((Extended1) nm).f();//Must downcast to access f();
        WithMethods wm = new Extended2();
        wm.f();
    }
}/* Output:
Extended1.f
Extended2.f
*///:~