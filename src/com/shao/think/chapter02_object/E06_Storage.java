//:chapter02_object/E06_Storage
/***************Exercise 6 ******************
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter
 ********************************************/
package com.shao.think.chapter02_object;

public class E06_Storage {
    String s = "Hello, World!";
    int storage(String s){
        return s.length() * 2;
    }

    void print(){
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args){
        E06_Storage st = new E06_Storage();
        st.print();
    }
} /* Output:
storage(s) = 26
*///:~
