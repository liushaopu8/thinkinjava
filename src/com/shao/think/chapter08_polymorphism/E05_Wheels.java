//:chapter08_polymorphism/E05_Wheels.java
/*************  Exercise 05 ******************
 * Starting from Exercise1, add a sheels()
 * method in cycle, which returns the number of
 * wheels. Modify ride)( to call wheels() and
 * verify that polymorphism works.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.cycle.Bicycle;
import com.shao.think.chapter08_polymorphism.cycle.Cycle;
import com.shao.think.chapter08_polymorphism.cycle.Tricycle;
import com.shao.think.chapter08_polymorphism.cycle.Unicycle;

public class E05_Wheels {
    public static void ride(Cycle c){
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args){
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}   /* Output:
Num. of wheels: 1
Num. of wheels: 2
Num. of wheels: 3
*///:~
