//: chapter15_generics/.java
/*************** Exercise 08 *******************
 * Following the form of the Coffee example, create
 * a hierarchy of StoryCharacters from your favorite
 * movie, dividing them into GoodGuys and BadGuys.
 * Create a generator for StoryCharacters, following
 * the form of CoffeeGenerator
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Generator;

import java.util.Iterator;
import java.util.Random;

class StoryCharacter{ }

class GoodGuy extends StoryCharacter{}

class BadGuy extends StoryCharacter{}

class Morton extends BadGuy{}

class Frank extends BadGuy{}

class Harmonica extends GoodGuy{}

class Cheyenne extends GoodGuy{}

class CharacterGenerator implements
        Generator<StoryCharacter>, Iterable<StoryCharacter>{

    private Class<?>[] types = {
            Morton.class, Frank.class,
            Harmonica.class, Cheyenne.class
    };
    private static Random rand = new Random(47);
    public CharacterGenerator(){}
    private int size = 0;
    public CharacterGenerator(int sz) {
        size = sz;
    }

    @Override
    public StoryCharacter next() {
        try {
            return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<StoryCharacter>{

        int count = size;
        public boolean hasNext() { return count > 0;}


        @Override
        public StoryCharacter next() {
            count--;
            return CharacterGenerator.this.next();
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new CharacterIterator();
    }
}



public class E08_CharacterGeneractor {
    public static void main(String args[]){
        CharacterGenerator gen = new CharacterGenerator();
        for (int i = 0; i < 7; i++) {
            System.out.println(gen.next());
        }
        for(StoryCharacter p : new CharacterGenerator(7)){
            System.out.println(p);
        }
    }
}   /*  Output:
com.shao.think.chapter15_generics.Harmonica@677327b6
com.shao.think.chapter15_generics.Frank@14ae5a5
com.shao.think.chapter15_generics.Harmonica@7f31245a
com.shao.think.chapter15_generics.Morton@6d6f6e28
com.shao.think.chapter15_generics.Morton@135fbaa4
com.shao.think.chapter15_generics.Harmonica@45ee12a7
com.shao.think.chapter15_generics.Morton@330bedb4
com.shao.think.chapter15_generics.Frank@2503dbd3
com.shao.think.chapter15_generics.Harmonica@4b67cf4d
com.shao.think.chapter15_generics.Harmonica@7ea987ac
com.shao.think.chapter15_generics.Frank@12a3a380
com.shao.think.chapter15_generics.Cheyenne@29453f44
com.shao.think.chapter15_generics.Frank@5cad8086
com.shao.think.chapter15_generics.Morton@6e0be858
 *///:~
