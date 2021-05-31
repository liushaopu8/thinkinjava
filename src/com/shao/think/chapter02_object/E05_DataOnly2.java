//:chapter02_object/E05_DataOnly2
/***************Exercise 5 ******************
 * Modify Exercise 4 so the values
 * of the data in DataOnly are assigned to and
 * printed in main()
 ********************************************/
package com.shao.think.chapter02_object;

public class E05_DataOnly2 {
    int i ;
    double d;
    boolean b;
    public static void main(String[] args){
        E05_DataOnly2 d = new E05_DataOnly2();
        d.i = 47;
        System.out.println("d.i = " + d.i);
        d.d = 1.1;
        System.out.println("d.d = " + d.d);
        d.b = false;
        System.out.println("d.b = " + d.b);
    }
} ///:~
