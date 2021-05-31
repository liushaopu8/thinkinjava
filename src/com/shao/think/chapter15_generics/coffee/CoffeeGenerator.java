package com.shao.think.chapter15_generics.coffee;

import com.shao.think.util.Generator;
import com.shao.think.util.Print;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator
        implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {
            Latte.class, Mocha.class, Cappuccino.class,
            Americano.class, Breve.class,
    };
    private static Random rand = new Random(47);
    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int sz){ size = sz;}

    public Coffee next(){
        try {
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext(){ return count >  0; }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args){
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            Print.print(gen.next());
        for(Coffee c : new CoffeeGenerator(5))
            Print.print(c);
    }
}
