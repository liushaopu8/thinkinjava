//:chapter08_polymorphism/E11_Pickle.java
/*************  Exercise 11 ******************
 * Add class pickle to Sandwich.java
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.util.Print;

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

class Pickle{
    Pickle(){ Print.print("Pickle()");}
}

class Lunch extends Meal{
    Lunch(){Print.print("Lunch()");}
}

class PortableLunch extends Lunch{
    PortableLunch(){Print.print("PortableLunch()");}
}

class Sandwich2 extends PortableLunch{
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();
    Sandwich2(){Print.print("Sandwich2()");}
}

public class E11_Pickle {
    public static void main(String[] args){
        new Sandwich2();
    }
}   /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Pickle()
SandWich2()
*///:~
