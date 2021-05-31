//: chapter15_generics/.java
/*************** Exercise 07 *******************
 * Use composition instead of inheritance to adapt
 * Fibonacci to make it Iterable.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Generator;

import java.util.Iterator;

class Fibonacci implements Generator<Integer> {
    private int count = 0;
    private int fib(int n){
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    @Override
    public Integer next() {
        return fib(count++);
    }
}

class IterableFibonacci implements Iterable<Integer> {

    private Fibonacci fib = new Fibonacci();
    private int n;
    public IterableFibonacci(int count){ n = count;}

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next(){
                --n;
                return fib.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class E07_IterableFibonacci2 {
    public static void main(String args[]){
        for(int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}   /*  Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
 *///:~
