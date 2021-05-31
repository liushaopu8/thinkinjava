//:chapter09_interfaces/E14_InterfaceInheritance.java
/***************** Exercise 14 ********************
 * Create three interfaces, each with two methods.
 * Inherit a new interface from each, adding a new
 * method. Use the new interface to create a class,
 * and inherit from a concrete class. Now write four
 * methods, each of which takes one of the four
 * interfaces as an argument. Create an object of
 * your class in main(), and pass it to each of the
 * methods.
 **************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

interface Interface1{
    void f1();
    void g1();
}
interface Interface2{
    void f2();
    void g2();
}
interface Interface3{
    void f3();
    void g3();
}

interface Multiple extends Interface1,Interface2,Interface3{
    void h();
}

class Concrete{
    String s;
    public Concrete(String s){
        this.s = s;
    }
}
class All extends Concrete implements Multiple{

    public All() {
        super("All");
    }

    @Override
    public void f1() {
        Print.print("All.f1");
    }

    @Override
    public void g1() {
        Print.print("All.g1");
    }

    @Override
    public void f2() {
        Print.print("All.f2");
    }

    @Override
    public void g2() {
        Print.print("All.g2");
    }

    @Override
    public void f3() {
        Print.print("All.f3");
    }

    @Override
    public void g3() {
        Print.print("All.g3");
    }

    @Override
    public void h() {
        Print.print("All.h");
    }
}

public class E14_InterfaceInheritance {
    public static void main(String[] args){
        All a = new All();
        takes1(a);
        takes2(a);
        takes3(a);
        takesAll(a);
    }

    static void takes1(Interface1 i){
        i.f1();
    }
    static void takes2(Interface2 i){
        i.f2();
    }
    static void takes3(Interface3 i){
        i.f3();
    }

    private static void takesAll(All a) {
        a.g1();
        a.g2();
        a.g3();
        a.h();
    }
}/* Output:
Note that
*///:~
