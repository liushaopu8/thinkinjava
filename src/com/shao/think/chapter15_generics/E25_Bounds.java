//: chapter15_generics/.java
/*************** Exercise 25 *******************
 * Create two interfaces and a class that implements
 * both. Create two generic methods, one whose
 * argument parameter is bounded by the first interface
 * and on whose argument parameter is bounded by the
 * second interface. Create an instance of the class
 * that implements both interfaces. and show that it
 * can be used with both generic methods.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

interface Low{
    void c();
    void d();
}

class TopLowImpl implements Top,Low{

    @Override
    public void c() {
        Print.print("Low:c()");
    }

    @Override
    public void d() {
        Print.print("Low:d()");
    }

    @Override
    public void a() {
        Print.print("Top:a()");
    }

    @Override
    public void b() {
        Print.print("Top:b()");
    }
}
public class E25_Bounds {
    static <T extends Top> void top(T obj){
        obj.a();
        obj.b();
    }
    static <T extends Low> void low(T obj){
        obj.c();
        obj.d();
    }
    public static void main(String args[]){
        TopLowImpl tli = new TopLowImpl();
        top(tli);
        low(tli);
    }
}   /*  Output:
 *///:~
