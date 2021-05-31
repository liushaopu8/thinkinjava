//:chapter08_polymorphism/E17_RTTI.java
//{ThrowsException
/*************  Exercise 17 ******************
 * Add a balance() method to Unicycle and Bicycle
 * but not to Tricycle, using the Cycle hierarchy
 * from Exercise 1. Upcast instances of all three
 * types to an array of Cycle. Try to call balance()
 * on each element of the array and observe the
 * results. Downcast and call balance() and observe
 * what happens.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.cycle.Bicycle;
import com.shao.think.chapter08_polymorphism.cycle.Cycle;
import com.shao.think.chapter08_polymorphism.cycle.Tricycle;
import com.shao.think.chapter08_polymorphism.cycle.Unicycle;

public class E17_RTTI {
    public static void main(String[] args){
        Cycle[] cycles = new Cycle[]{new Unicycle(),
        new Bicycle(), new Tricycle()};

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance();

    }

}
