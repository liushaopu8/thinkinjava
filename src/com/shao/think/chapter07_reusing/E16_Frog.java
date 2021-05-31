//: chapter07_reusing/E16_Frog.java
/****************** Exercise 16 *******************
 * Create a class called Amphibian. From it, inherit
 * a class from it called Frog. Put appropriate methods
 * in the base class In main(), create a Frog, upcast
 * it to Amphibian, and demonstrate taht all the methods
 * still work.
 ************************************************/
package com.shao.think.chapter07_reusing;

class Amphibian{
    public void moveInWater(){
        System.out.println("Moving in Water");
    }

    public void moveOnLand(){
        System.out.println("Moving on Land");
    }
}

class Frog extends Amphibian{}
public class E16_Frog {
    public static void main(String[] args){
        Amphibian a = new Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}/* Output:
Moving in Water
Moving on Land
*///:~
