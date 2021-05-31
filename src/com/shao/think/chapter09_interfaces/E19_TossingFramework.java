//:chapter09_interfaces/E19_TossingFramework.java
/***************** Exercise 19 ********************
 * Create a framework using Factory Methods that performs
 * both coin tossing and dice tossing.
 **************************************************/
package com.shao.think.chapter09_interfaces;

interface Tossing {
    boolean event();
}
interface TossingFactory {
    Tossing getTossing();
}

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;
    public boolean event() {
        System.out.println("Coin tossing event " + events);
        return ++events != EVENTS;
    }
}

class ConinTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new CoinTossing();
    }
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;
    public boolean event() {
        System.out.println("Dice tossing event " + events);
        return ++events != EVENTS;
    }
}

class DiceTossingFactory implements TossingFactory {
    @Override
    public Tossing getTossing() {
        return new DiceTossing();
    }
}

public class E19_TossingFramework {
    public static void simulate(TossingFactory fact){
        Tossing t = fact.getTossing();
        while(t.event());
    }
    public static void main(String[] args){
        simulate(new ConinTossingFactory());
        simulate(new DiceTossingFactory());
    }

}/* Output:
Coin tossing event 0
Coin tossing event 1
Dice tossing event 0
Dice tossing event 1
Dice tossing event 2
Dice tossing event 3
Dice tossing event 4
Dice tossing event 5
*///:~
