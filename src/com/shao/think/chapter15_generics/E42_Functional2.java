//: chapter15_generics/.java
/*************** Exercise 42 *******************
 * Create two separate calsses, with nothing in
 * common. Each class should hold a value, and at
 * least have methods that produce that value and
 * perform a modification upon that value. Modify
 * Functional.java so that it performs functional
 * operations on collections of your classes(these
 * operations do not have to be arithmetic as they
 * are in Functional.java)
 **********************************************/
package com.shao.think.chapter15_generics;

import java.util.Arrays;
import java.util.List;

final class DataManipulator1 implements Comparable<DataManipulator1>{
    private int value;

    public DataManipulator1(int value){ this.value = value;}


    @Override
    public int compareTo(DataManipulator1 o) {
        return Integer.valueOf(value).compareTo(o.value);
    }

    public void increment() {
        ++value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

final class DataManipulator2{
    private String value;
    public DataManipulator2(String value){ setValue(value);}

    public String getValue() {
        return value;
    }

    public void setValue(String s) {
        this.value = s;
    }
}

interface UnaryFunction<R,T> {
    R function(T x);
}

interface Combiner<T> {
    T combine(T x,T y);
}
public class E42_Functional2 {
    static class Incrementor implements
            UnaryFunction<DataManipulator1,DataManipulator1>{
        public DataManipulator1 function(DataManipulator1 x){
            x.increment();
            return x;
        }
    }

    static class UpperCaseConverterer
    implements UnaryFunction<String, DataManipulator2>{
        public String function(DataManipulator2 x){
            return x.getValue().toUpperCase();
        }
    }

    static class Concatenator
    implements Combiner<DataManipulator2>{
        public DataManipulator2 combine(DataManipulator2 x,DataManipulator2 y){
            x.setValue(x.getValue() + y.getValue());
            return x;
        }
    }
    public static void main(String args[]){
        DataManipulator1 rf = new DataManipulator1(4);
        List<DataManipulator1> ldm1 = Arrays.asList(
                new DataManipulator1(3), new DataManipulator1(10),
                new DataManipulator1(1), new DataManipulator1(7)
        );

//        Functional.filter();

        List<DataManipulator2> ldm2 = Arrays.asList(
                new DataManipulator2("a"), new DataManipulator2("B"),
                new DataManipulator2("c"), new DataManipulator2("d")
        );

    }
}   /*  Output:
*///:~
