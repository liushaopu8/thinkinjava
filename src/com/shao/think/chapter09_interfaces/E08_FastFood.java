//:chapter09_interfaces/E08_FastFood.java
/***************** Exercise 08 ********************
* Create an interface called FastFood( with appropriate
 * methods) in polymorphism. Sandwich.java, and change
 * Sandwich so it also implements FastFood.
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

interface FastFood{
    void rushOrder();
    void gobble();
}
class Meal{
    Meal(){Print.print("Meal()");}
}

class Bread{
    Bread(){Print.print("Bread()");}
}
class Cheese{
    Cheese(){Print.print("Cheese()");}
}
class Lettuce{
    Lettuce(){Print.print("Lettuce()");}
}

class Lunch extends Meal{
    Lunch(){Print.print("Lunch()");}
}

class PortableLunch extends Lunch{
    PortableLunch(){Print.print("PortableLunch()");}
}

class Sandwich extends PortableLunch{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Sandwich(){Print.print("Sandwich()");}
}
class FastSandwich extends Sandwich implements FastFood{

    @Override
    public void rushOrder() {
        Print.print("Rushing your sandwich order");
    }

    @Override
    public void gobble() {
        Print.print("Chomp! Snort! Gobble");
    }
}

public class E08_FastFood {
    public static void main(String[] args){
        FastSandwich burger = new FastSandwich();
        Print.print("Fries with that?");
        Print.print("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
Fries with that?
Super Size?
Rushing your sandwich order
Chomp! Snort! Gobble
*///:~
