//: chapter15_generics/.java
/*************** Exercise 13 *******************
 * Overload the fill() method so the arguments
 * and return types are the specific subtypes of
 * Collection: List, Queue and Set. This way, you
 * don't lose the type of container. Cann you overload
 * to distinguuish between List and LinkedList?
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter15_generics.coffee.Coffee;
import com.shao.think.chapter15_generics.coffee.CoffeeGenerator;
import com.shao.think.util.Generator;

import java.util.*;

public class E13_OverloadedFill {
    public static <T> List<T>
    fill (List<T> list, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> Queue<T>
    fill(Queue<T> queue, Generator<T> gen,int n){
        for (int i = 0; i < n; i++) {
            queue.add(gen.next());
        }
        return queue;
    }

    public static <T>LinkedList<T>
    fill(LinkedList<T> llist,Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            llist.add(gen.next());
        }
        return llist;
    }
    public static <T> Set<T>
    fill(Set<T> set, Generator<T> gen, int n){
        for (int i = 0; i < n; i++) {
            set.add(gen.next());
        }
        return set;
    }
    public static void main(String args[]){
        List<Coffee> coffeeList = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffeeList)
            System.out.println(c);

        Queue<Integer> iQueue = fill(new LinkedList<Integer>(), new Fibonacci(), 12);
        for (int i :
                iQueue) {
            System.out.println(i + " ");
        }
        System.out.println();

//        fill(new LinkedList<>(), new CountingGenerator.Character(), 12);
//        Set<Boolean> bSet = fill(new HashSet<>(),new CountingGenerator.Boolean(),10);
    }
}   /*  Output:
 *///:~
