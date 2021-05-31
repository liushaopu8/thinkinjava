//: chapter07_reusing/E24_JapaneseBeetle.java
/****************** Exercise 24 ******************
 * In Beetle.java, inherit a specific type of beetle
 * from calss Beetle, following the same format as
 * the existing classes. Trace and explain the output.
 ************************************************/
package com.shao.think.chapter07_reusing;

class Insect{
    private int i = 9;
    protected int j;
    Insect (){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized;");
    public static void main(String[] args){
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

class JapaneseBeetle extends Beetle{
    int m = printInit("JapaneseBeetle.m initialized");
    JapaneseBeetle(){
        System.out.println("m = " + m);
        System.out.println("j = " + j);
    }

    static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}

public class E24_JapaneseBeetle {
    public static void main(String args[]){
        new JapaneseBeetle();
    }
}/* Output:
static Insect.x1 initialized
static Beetle.x2 initialized;
static JapaneseBeetle.x3 initialized
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
JapaneseBeetle.m initialized
m = 47
j = 39
*///:~
