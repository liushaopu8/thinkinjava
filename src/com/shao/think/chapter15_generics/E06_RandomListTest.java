//: chapter15_generics/.java
/*************** Exercise 0 *******************
 * Use RandomList with two more types in addition
 * to the one shown in main()
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class RandomList<T>{
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item);}
    public T select(){
        return storage.get(rand.nextInt(storage.size()));
    }
}

public class E06_RandomListTest {

    private static void dump(RandomList<?> rl){
        for (int i = 0; i < 11; i++) {
            System.out.print(rl.select() + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        RandomList<String> rs = new RandomList<>();
        for(String s : ("The quick brown fox jumped over " +
        " the lazy brown dog").split(" "))
            rs.add(s);
        dump(rs);

//        RandomList<Integer> ri = new RandomList<>();
//        Generator<Integer> gi = new CountingGenerator.Integer();
//        for (int i = 0; i < 11; i++) {
//            ri.add(gi.next());
//        }
//        dump(ri);
    }
}   /*  Output:
 *///:~
