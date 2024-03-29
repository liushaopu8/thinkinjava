//:chapter09_interfaces/E18_CycleFactories.java
/***************** Exercise 18 ********************
 * Create a Cycle interface, with implementations
 * Unicycle, Bicycle, and Tricycle. Create factories
 * for each type of Cycle, and code that uses these
 * factories.
 **************************************************/
package com.shao.think.chapter09_interfaces;

interface Cycle{
    int wheels();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{

    @Override
    public int wheels() {
        return 1;
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class Bicycle implements Cycle {
    @Override
    public int wheels() {
        return 2;
    }
}
class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public int wheels() {
        return 3;
    }
}
class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }


}

public class E18_CycleFactories {
    public static void ride(CycleFactory fact){
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args){
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }


}/* Output:
Num. of wheels: 1
Num. of wheels: 2
Num. of wheels: 3
*///:~
