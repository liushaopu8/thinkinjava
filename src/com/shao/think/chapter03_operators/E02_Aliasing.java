//: chapter03_operators:/E02_Aliasing.java
/*********************** Exercise 2 *******************
 *  Crete a class containing a float and use it to
 *  demonstrate aliasing
 ******************************************************/
package com.shao.think.chapter03_operators;

class Integral {
    float f;
}
public class E02_Aliasing {
    public static void mian(String[] args){
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 9f;
        n2.f = 47f;

    }
} /* Output:

*///:~
