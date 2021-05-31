package com.shao.think.chapter15_generics;

//:generics/TupleTest.java

import com.shao.think.chapter15_generics.tuple.FiveTuple;
import com.shao.think.chapter15_generics.tuple.FourTuple;
import com.shao.think.chapter15_generics.tuple.ThreeTuple;
import com.shao.think.chapter15_generics.tuple.TwoTuple;

class Amphibian{}
class Vehicle{}
public class TupleTest {
    static TwoTuple<String , Integer> f(){
        //Autoboxing converts
        return new TwoTuple<String, Integer> ("hi", 47);
    }

    static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<>(new Amphibian(),"hi",48);
    }

     static FourTuple<Vehicle,Amphibian,String, Integer> h(){
        return new FourTuple<>(new Vehicle(),new Amphibian(),"hi", 49);
     }

     static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTuple<>(new Vehicle(),new Amphibian(),"hi", 50, 11.1);
     }

     public static void main(String[] args){
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
//        ttsi.first = "there";// can't assign a value to final variable
         System.out.println(g());
         System.out.println(h());
         System.out.println(k());
     }

}
