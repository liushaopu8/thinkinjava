//: chapter15_generics/.java
/*************** Exercise 12 *******************
 * Repeat the previous exercise using explicit type
 * specification
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.New;

import java.util.List;
import java.util.Set;

import static com.shao.think.util.New.list;

public class E12_NewTest2 {
    static void f(List<SixTuple<Byte,Short,String,Float,Double,Integer>> l){
        l.add(new SixTuple<Byte,Short,String,Float,Double,Integer>(
                (byte)1, (short)1, "A",1.0F, 1.0, 1
        ));
        System.out.println(l);
    }

    static void g(Set<Sequence<String>> s){
        s.add(new Sequence<>(5));
        System.out.println(s);
    }

    public static void main(String args[]){
        f(New.list());
        g(New.set());
    }
}   /*  Output:
 *///:~
