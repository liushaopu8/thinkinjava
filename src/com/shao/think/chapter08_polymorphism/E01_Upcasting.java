//:chapter08_polymorphism/E01_Upcasting.java
/*************  Exercise 01 ******************
 * Create a Cycle class, with subclasses Unicycle,
 * Bicycle, and Tricycle. Demonstrate that
 * an instance of each type can be upcast
 * to Cycle vai a ride() method.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.cycle.Cycle;
import com.shao.think.chapter08_polymorphism.cycle.Tricycle;
import com.shao.think.chapter08_polymorphism.cycle.Unicycle;

public class E01_Upcasting {
    public static void ride(Cycle c){}
    public static void main(String[] args){
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Tricycle());
    }
}
