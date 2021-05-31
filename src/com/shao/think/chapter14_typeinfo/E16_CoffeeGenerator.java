//: chapter14_typeinfo/E16_CoffeeGenerator.java
/***********************************************
 * Modify the Coffee hierarchy in the Generics
 * chapter to use Registered Factories.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.chapter14_typeinfo.coffee2.Coffee;
import com.shao.think.util.Generator;

import java.util.Iterator;

public class E16_CoffeeGenerator
implements Generator<Coffee>,Iterable<Coffee> {
    public E16_CoffeeGenerator(){}
    private int size = 0;
    public E16_CoffeeGenerator(int sz){ size = sz;}
    public Coffee next(){ return Coffee.createRandom();}


    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return E16_CoffeeGenerator.this.next();
        }
        public void remove(){}
    }


    public static void main(String [] args){
        for(Coffee c : new E16_CoffeeGenerator(10))
            System.out.println(c);
    }

}   /*  Output:
Mocha 0
Latte 1
Mocha 2
Breve 3
Breve 4
Mocha 5
Breve 6
Latte 7
Mocha 8
Mocha 9
 *///:~
