//: chapter14_typeinfo/E10_PrimitiveOrTrue.java
/***********************************************
 * Write a program to determine whether an array
 * of char is a primitive type or a true object.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

public class E10_PrimitiveOrTrue {
    public static void main(String [] args){
        char[] ac = "Hello, World!".toCharArray();
        Print.print("ac.getClass() = " + ac.getClass());
        Print.print("ac.getClass().getSuperClass() = " +
        ac.getClass().getSuperclass());
        int[] ia = new int[3];
        Print.print("ia.getClass() = " + ia.getClass());
        long[] la = new long[3];
        Print.print("la.getClass() = " + la.getClass());
        double[] da = new double[3];
        Print.print("da.getClass() = " + da.getClass());
        String[] sa = new String[3];
        Print.print("sa.getClass() = " + sa.getClass());
        E10_PrimitiveOrTrue[] pot = new E10_PrimitiveOrTrue[3];
        Print.print("pot.getClass() = " + pot.getClass());
        int[][][] threed = new int[3][][];
        Print.print("threed.getClass() = " + threed);
    }
}   /*  Output:
ac.getClass() = class [C
ac.getClass().getSuperClass() = class java.lang.Object
ia.getClass() = class [I
la.getClass() = class [J
da.getClass() = class [D
sa.getClass() = class [Ljava.lang.String;
pot.getClass() = class [Lcom.shao.think.chapter14_typeinfo.E10_PrimitiveOrTrue;
threed.getClass() = [[[I@1540e19d
 *///:~
