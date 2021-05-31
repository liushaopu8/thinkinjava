//:chapter09_interfaces/E06_InterfacePublicMethods.java
/***************** Exercise 06 ********************
 * Prove taht all the methods in an interface are
 * automatically public
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.chapter09_interfaces.ownpackage.AnInterface;

public class E06_InterfacePublicMethods implements AnInterface {
    /**
     * this f clashes with the f in AnInterface. attempting to assign weaker access privileges
     *  void f();
     */
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    @Override
    public void h() {

    }

    public static void main(String[] args){

    }

}/* Output:

*///:~