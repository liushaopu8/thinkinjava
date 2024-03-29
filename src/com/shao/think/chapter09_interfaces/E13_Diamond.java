//:chapter09_interfaces/E13_Diamond.java
/***************** Exercise 13 ********************
 * Create an interface, inherit two new interfacs from
 * it, then multiply-inherit a third interface from
 * the second two.
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

interface BaseInterface{
    void f();
}

interface IntermediateInterface1 extends BaseInterface{
    void f();
}

interface IntermediateInterface2 extends BaseInterface{
    void f();
}

interface CombinedInterface extends IntermediateInterface1,IntermediateInterface2{
    void f();
}

class CombinedImpl implements CombinedInterface{

    @Override
    public void f() {
        Print.print("CombinedImpl.f()");
    }
}

public class E13_Diamond {
    public static void main(String[] args){
        new CombinedImpl().f();
    }
}/* Output:
CombinedImpl.f()
*///:~
