//: chapter15_generics/.java
/*************** Exercise 16 *******************
 * Add a SixTuple to Tuple.java, and test it in
 * TupleTest2.java
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter15_generics.tuple.*;

import static com.shao.think.chapter15_generics.tuple.Tuple.tuple;

class Tuple2 extends Tuple {
    public static <A,B,C,D,E,F> SixTuple<A,B,C,D,E,F>
    tuple(A a, B b, C c, D d, E e, F f){
        return new SixTuple<A,B,C,D,E,F>(a,b,c,d,e,f);
    }
}

public class E16_TupleTest3 {
    static TwoTuple<String, Integer> f(){
        return tuple("hi",47);
    }
    static ThreeTuple<Amphibian, String, Integer> g(){
        return tuple(new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle, Amphibian,String, Integer> h(){
        return tuple(new Vehicle(), new Amphibian(), "hi",47);
    }
    static FiveTuple<Vehicle, Amphibian,String, Integer,Double> k(){
        return tuple(new Vehicle(), new Amphibian(), "hi",47,11.1);
    }
    static SixTuple<Vehicle,Amphibian,String , Integer, Double, Float>
    l(){
        return Tuple2.tuple(new Vehicle(), new Amphibian(),"hi",47, 11.1, 1.0F);
    }

    public static void main(String args[]){
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}   /*  Output:
TwoTuple{first=hi, second=47}
ThreeTuple{third=47, first=com.shao.think.chapter15_generics.Amphibian@1540e19d, second=hi}
FourTuple{fourth=47, third=hi, first=com.shao.think.chapter15_generics.Vehicle@677327b6, second=com.shao.think.chapter15_generics.Amphibian@14ae5a5}
FiveTuple{fifth=11.1, fourth=47, third=hi, first=com.shao.think.chapter15_generics.Vehicle@7f31245a, second=com.shao.think.chapter15_generics.Amphibian@6d6f6e28}
(com.shao.think.chapter15_generics.Vehicle@135fbaa4, com.shao.think.chapter15_generics.Amphibian@45ee12a7, hi, 47, , 1.0)

 *///:~
