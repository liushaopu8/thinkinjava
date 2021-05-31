//: chapter15_generics/.java
/*************** Exercise 11 *******************
 * Test new.java by creating your own classes and
 * ensuring that New will work properly with them.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.New;

import java.util.List;
import java.util.Set;

public class E11_NewTest {
    public static void main(String args[]){
        List<SixTuple<Byte,Short,String,Float,Double,Integer>>
                list = New.list();
        list.add(new SixTuple<Byte,Short,String,Float,Double,Integer>(
                (byte)1,(short)1,"A",1.0f,1.0,1));
        System.out.println(list);
        Set<Sequence<String>> set = New.set();
        set.add(new Sequence<>(5));
        System.out.println(set);
    }
}   /*  Output:
 *///:~
