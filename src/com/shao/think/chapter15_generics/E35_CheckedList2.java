//: chapter15_generics/.java
/*************** Exercise 35 *******************
* Modify CheckedList.java so that it uses the Coffee
 * classes defined in this chapter.
 **********************************************/
package com.shao.think.chapter15_generics;


import com.shao.think.chapter15_generics.coffee.Americano;
import com.shao.think.chapter15_generics.coffee.Breve;
import com.shao.think.chapter15_generics.coffee.Coffee;
import com.shao.think.util.Print;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E35_CheckedList2 {
    static void oldStyleMethod(List probablyAmericanos){
        probablyAmericanos.add(new Breve());
    }
    public static void main(String args[]){
        List<Americano> am1 = new ArrayList<Americano>();
        oldStyleMethod(am1);
        List<Americano> am2 = Collections.checkedList(
                new ArrayList<Americano>(), Americano.class);
        try {
            oldStyleMethod(am2);
        }catch(Exception e){
            Print.print(e);
        }
        List<Coffee> coffees = Collections.checkedList(
                new ArrayList<Coffee>(), Coffee.class
        );
        coffees.add(new Americano());
        coffees.add(new Breve());
    }
}   /*  Output:
java.lang.ClassCastException: Attempt to insert class com.shao.think.chapter15_generics.coffee.Breve element
into collection with element type class com.shao.think.chapter15_generics.coffee.Americano

 *///:~
