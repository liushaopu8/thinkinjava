//: chapter15_generics/.java
/*************** Exercise 18 *******************
 * Following the form of BankTeller.java, create
 * an example where BigFish eat LittleFish in the
 * Ocean.
 **********************************************/
package com.shao.think.chapter15_generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class LittleFish{}

class BigFish{

}
public class E18_OcanLife {
    public static void eat(BigFish bf, LittleFish lf){
        System.out.println(bf + " eat " + lf);
    }
    public static void main(String args[]){
        Random rand = new Random(47);
        List<LittleFish> littleF = new LinkedList<LittleFish>();
    }
}   /*  Output:
 *///:~
