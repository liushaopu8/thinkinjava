//: chapter15_generics/.java
/*************** Exercise 09 *******************
 * Modify GenericMethods.java so that f() accepts
 * three arguments, all of which are of a different
 * parameterized type.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

public class E09_GenericMethods2 {
    public <A,B,C> void f(A a, B b, C c){
        Print.print(a.getClass().getName());
        Print.print(b.getClass().getName());
        Print.print(c.getClass().getName());
    }
    public static void main(String args[]){
        E09_GenericMethods2 gm = new E09_GenericMethods2();
        gm.f("" , 1, 1.0);
        gm.f(1.0f , 'c' , gm);
    }
}   /*  Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
com.shao.think.chapter15_generics.E09_GenericMethods2
 *///:~
