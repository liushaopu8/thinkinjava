//: chapter07_reusing/E17_Frog2.java
/****************** Exercise 17 *******************
 * Modify Exercise 16 so Frog overrides the mehtod
 * definitions from the base class(provides new
 * definitions using the same mehtod signatures).
 * Note what happens in main().
 ************************************************/
package com.shao.think.chapter07_reusing;

class Frog2 extends Amphibian{
    @Override
    public void moveInWater() {
        System.out.println("Frog swimming");
    }

    @Override
    public void moveOnLand() {
        System.out.println("Frog jumping");
    }
}

public class E17_Frog2 {
    public static void  main(String[] args){
        Amphibian a = new Frog2();
        a.moveOnLand();
        a.moveInWater();
    }
} /*    Output:
Frog jumping
Frog swimming
*///:~
