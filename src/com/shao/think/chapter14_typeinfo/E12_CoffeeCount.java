//: chapter14_typeinfo/E12_CoffeeCount.java
/***********************************************
 * Use TypeCounter with the CoffeeGenerator.java
 * class in the Generics chapter.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.chapter15_generics.coffee.Coffee;
import com.shao.think.chapter15_generics.coffee.CoffeeGenerator;
import com.shao.think.util.Print;
import com.shao.think.util.TypeCounter;

import java.util.Iterator;

public class E12_CoffeeCount {
    public static void main(String [] args){
        TypeCounter counter = new TypeCounter(Coffee.class);
        for(Iterator<Coffee> it = new CoffeeGenerator(20).iterator(); it.hasNext();){
            Coffee coffee = it.next();
            Print.printnb(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        Print.print(counter);
    }

}   /*  Output:
Americano Latte Americano Mocha Mocha Breve Americano Latte Cappuccino Cappuccino Americano Americano Mocha Breve Breve Americano Americano Mocha Latte Americano
{Americano=8, Mocha=4, Cappuccino=2, Latte=3, Breve=3, Coffee=20}
 *///:~
