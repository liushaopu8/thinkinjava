//:chapter09_interfaces/E15_AbstractsAndInterfaces.java
/***************** Exercise 15 ********************
* Modify Exercise 14 by creating and abstract class
 * and inheriting it into the derived class.
 **************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

abstract class Abstract{
    String s;
    public Abstract(String s){ this.s = s;}
    abstract void af();
}

class All2 extends Abstract implements Multiple{

    public All2() {
        super("All2");
    }

    @Override
    void af() {
        Print.print("All.af");
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
        Print.print("All2.h");
    }
}

public class E15_AbstractsAndInterfaces {
    public static void main(String[] args){
        All2 a = new All2();
        takes1(a);
        takes2(a);
        takes3(a);
        takesAll(a);
        takesAbstract(a);
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
    static void takesAbstract(Abstract a){
        a.af();
    }
    private static void takesAll(All2 a) {
        a.g1();
        a.g2();
        a.g3();
        a.h();
    }
}/* Output:
All.f1
All.f2
All.f3
All.g1
All.g2
All.g3
All2.h
All.af
*///:~
