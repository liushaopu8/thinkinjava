//: chapter15_generics/.java
/*************** Exercise 10 *******************
 * Modify the previous exercise so that one of
 * f()'s arguments is non-parameterized.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

public class E10_GenericMethods3 {
    public <A,B> void f(A a, B b, Boolean c){
        Print.print(a.getClass().getName());
        Print.print(b.getClass().getName());
        Print.print(c.getClass().getName());
    }

    public static void main(String args[]){
        E10_GenericMethods3 gm = new E10_GenericMethods3();
        gm.f("",1, true);
        gm.f(1.0f, 1.0f,false);
        gm.f('c',gm, true);
    }
}   /*  Output:
 *///:~
