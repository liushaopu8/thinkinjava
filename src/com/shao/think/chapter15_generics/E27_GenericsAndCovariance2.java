//: chapter15_generics/.java
/*************** Exercise 27 *******************
 * Show that covariance doesn't work with Lists,
 * using Numbers and Integers, then introduce
 * wildcards.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.util.ArrayList;
import java.util.List;

public class E27_GenericsAndCovariance2 {
    public static void main(String args[]){
//        List<Number> nlist = new ArrayList<Integer>();
        List<? extends Number> nlist = new ArrayList<Integer>();
        /*   can't add any type of object:
        nlist.add(new Integer(1));
        nlist.add(new Float(1.0));
        nlist.add((Number) new Object());
        */
        nlist.add(null);
        Print.print(nlist.get(0));
    }
}   /*  Output:
null
 *///:~
