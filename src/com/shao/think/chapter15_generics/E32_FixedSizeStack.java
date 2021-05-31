//: chapter15_generics/.java
/*************** Exercise 32 *******************
* Verify thatFixedSizeStack in GenericCast.java
 * generates exceptions if you try to go out of
 * its bounds. Does this mean that bounds-checking
 * code is not required?
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.lang.reflect.Array;

class FixedSizeStack<T>{
    private int index;
    private Object[] storage;

    public FixedSizeStack(int size){
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }
    public T pop(){
        return (T) storage[--index];
    }
}

public class E32_FixedSizeStack {
    public static void main(String args[]){
        FixedSizeStack<Integer> stack =
                new FixedSizeStack<Integer>(1);
        stack.push(1);
        System.out.println(stack.pop());
        try{
            stack.pop();
        }catch(ArrayIndexOutOfBoundsException e){
            Print.print(e.toString());
        }

        stack = new FixedSizeStack<Integer>(1);
        stack.push(2);
        try {
            stack.push(2);
        }catch(ArrayIndexOutOfBoundsException e){
            Print.print(e.toString());
        }
    }
}   /*  Output:
 *///:~
