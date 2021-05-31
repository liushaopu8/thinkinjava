//: chapter15_generics/.java
/*************** Exercise 29 *******************
 * Create a generic method that takes as an argument
 * a Holder<List<?>>, determine what methods you
 * can and can't call for the Holder and for the
 * List. Repeat for an argument of List</?>>
 **********************************************/
package com.shao.think.chapter15_generics;
import com.shao.think.chapter15_generics.holder.Holder;
import com.shao.think.util.Print;

import java.util.ArrayList;
import java.util.List;


public class E29_WildcardTest {
    static void f1(Holder<List<?>> holder){
        List<?> list = holder.get();
        Print.print(holder.equals(list));
        /*   List can't be applied to :
        list.add(1);
        list.add(new Object());
        */
        Integer i = (Integer) list.get(0);
        Print.print(i);
        Print.print(list.contains(i));
        Print.print(list.remove(i));
        holder.set(new ArrayList<Float>());
    }
    static void f2(List<Holder<?>> list){
        Holder<?> holder = list.get(0);
        Print.print(holder.equals(Integer.valueOf(1)));
        /*
            In Holder can't be applied to
            holder.set(new Integer(2));
         */
        Print.print(holder.get());
        list.add(new Holder<Float>(1.0f));
        Print.print(list.get(1).get());
        list.remove(0);
        Print.print(list.size());
    }
    public static void main(String args[]){
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        f1(new Holder<List<?>> (list1));

        List<Holder<?>> list2 = new ArrayList<>();
        list2.add(new Holder<Integer>(1));
        f2(list2);
    }
}   /*  Output:
true
1
true
true
true
1
1.0
1
 *///:~
