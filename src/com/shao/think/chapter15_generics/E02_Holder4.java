//: chapter15_generics/E02_Holder4.java
/*************** Exercise 02 *******************
 * Create a holder class that holds three objects
 * of the same type, along with the methods to
 * store and fetch those objects and a constructor
 * to initialize all three
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

class Holder4<T>{
    private T a, b, c;
    public Holder4(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(T a){ this.a = a;}
    public void setB(T b){ this.b = b;}
    public void setC(T c){ this.c = c;}
    public T getA(){ return a;}
    public T getB(){ return b;}
    public T getC(){ return c;}
}

public class E02_Holder4 {
    public static void main(String args[]){
        Holder4<String> h4 = new Holder4<String>("A","B","C");
        Print.print(h4.getA());
        Print.print(h4.getB());
        Print.print(h4.getC());
        h4.setC("D");
        Print.print(h4.getC());
    }
}   /*  Output:
A
B
C
D
 *///:~
