//: chapter15_generics/E03_SixTuple.java
/*************** Exercise 03 *******************
 * Create and test a SimTuple generic
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter15_generics.tuple.FiveTuple;

class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
    public final F sixth;
    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = f;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + ", " +
                sixth + ")";
    }
}

public class E03_SixTuple {
    static SixTuple<Vehicle,Amphibian, String, Float, Double, Byte> a(){
        return new SixTuple<Vehicle,Amphibian, String, Float, Double, Byte>(
                new Vehicle(), new Amphibian(), "hi", (float)4.7,
                1.1,(byte)1);
    }

    public static void main(String args[]){
        System.out.print(a());
    }
}   /*  Output:
(com.shao.think.chapter15_generics.Vehicle@1540e19d, com.shao.think.chapter15_generics.Amphibian@677327b6, hi, 4.7, , 1)
 *///:~
