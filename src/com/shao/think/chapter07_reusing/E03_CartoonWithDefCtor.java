//: chapter07_reusing/E03_CartoonWithDefCtor.java
/****************** Exercise 2 *******************
 * Even if you don't create a constructor for
 * Cartoon(), the compiler will synthesize a
 * default constructor that calls the base-class
 * constructor. Prove that assertion.
 ************************************************/
package com.shao.think.chapter07_reusing;
class Art{
    Art(){ System.out.println("Art Constructor"); }
}

class Drawing extends Art{
    Drawing() {  System.out.println("Drawing constructor"); }
}

class CartoonWithDefCtor extends Drawing{

}

public class E03_CartoonWithDefCtor {
    public static void main(String args[]){
        new CartoonWithDefCtor();
    }
} /* Output:
Art Constructor
Drawing constructor
*///: ~