//:chapter09_interfaces/E05_ImplementInterface.java
/***************** Exercise 05 ********************
 * Create an interface with three methods in its own
 * package. Implement the interface in a different
 * package.
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.chapter09_interfaces.ownpackage.AnInterface;
import com.shao.think.util.Print;

class ImplementInterface implements AnInterface{

    @Override
    public void f() {
        Print.print("ImplementInterface.f");
    }

    @Override
    public void g() {
        Print.print("ImplementInterface.g");
    }

    @Override
    public void h() {
        Print.print("ImplementInterface.h");
    }
}

public class E05_ImplementInterface {
    public static void main(String[] args){
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }
}/* Output:
ImplementInterface.f
ImplementInterface.g
ImplementInterface.h
*///:~
