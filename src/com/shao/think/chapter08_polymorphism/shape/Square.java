//:chapter08_polymorphism.shape/Square.java
package com.shao.think.chapter08_polymorphism.shape;

public class Square extends Shape {
    @Override public void draw(){
        System.out.println("Square.draw()");
    }

    @Override public void erase() {
        System.out.println("Square.erase()");
    }
}///:~
