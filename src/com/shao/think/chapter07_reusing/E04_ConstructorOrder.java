//: chapter07_reusing/E04_ConstructorOrder.java
/****************** Exercise 2 *******************
 * Prove taht base-class constructors are
 * always called and called before derived-class
 * constructors.
 ************************************************/
package com.shao.think.chapter07_reusing;

class Base1{
    public Base1(){ System.out.println("Base1"); }
}

class Derived1 extends Base1{
    public Derived1(){ System.out.println("Derived1");}
}

class Derived2 extends Derived1{
    public Derived2(){ System.out.println("Derived2");}
}

public class E04_ConstructorOrder {
    public static void main(String[] args){
        new Derived2();
    }
} /* Output:
Base1
Derived1
Derived2
*///:~
