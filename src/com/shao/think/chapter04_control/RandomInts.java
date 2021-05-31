//: chapter04_control/RandomInts
/*******************************************
 * Write a program to generate 25 random int
 * values. Use an if-else statement for each value
 * to classify it as greater then, less then, or
 * equal to a second randomly generated value.
 *******************************************/
package com.shao.think.chapter04_control;

import java.util.Random;

public class RandomInts {
    static Random r = new Random(47);
    public static void compareRand(){
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        if(a < b)
            System.out.println("a < b");
        else if(a > b)
            System.out.println("a > b");
        else
            System.out.println("a = b");
    }

    public static void main(String[] args){
        for (int i = 0; i < 25; i++){
            compareRand();
        }
    }
}//: ~
