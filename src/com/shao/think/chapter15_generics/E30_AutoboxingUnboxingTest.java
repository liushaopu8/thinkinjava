//: chapter15_generics/.java
/*************** Exercise 30 *******************
 * Create a Holder for each of the primitive
 * wrapper types, and show that autoboxing and
 * autounboxing works for the set() and geet()
 * methods of each instance.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter15_generics.holder.Holder;
import com.shao.think.util.Print;

public class E30_AutoboxingUnboxingTest {
    public static void main(String args[]){
        Holder<Integer> hi = new Holder<Integer>();
        hi.set(1);
        Print.print(1 == hi.get());

        Holder<Byte> hb = new Holder<>();
        hb.set((byte)1);
        Print.print(1 == hb.get());

        Holder<Short> hs = new Holder<>();
        hs.set((short)1);
        Print.print(1 == hs.get());

        Holder<Long> hl = new Holder<>();
        hl.set((long)1);
        Print.print(1 == hl.get());

        Holder<Float> hf = new Holder<>();
        hf.set(1.0F);
        Print.print(1.0F == hf.get());

        Holder<Double> hd = new Holder<>();
        hd.set((double)1.0);
        Print.print(1.0 == hd.get());

        Holder<Character> hc = new Holder<>();
        hc.set('A');
        Print.print('A' == hc.get());

        Holder<Boolean> hbool = new Holder<>();
        hbool.set(true);
        Print.print(true == hbool.get());

    }
}   /*  Output:
true
true
true
true
true
true
true
true
 *///:~
