//:chapter08_polymorphism.shape/Square.java
package com.shao.think.chapter08_polymorphism.newshape;

public class Square extends Shape {
    public void draw(){
        System.out.println("Square.draw()");
    }
    public void erase() {
        System.out.println("Square.erase()");
    }
    public void msg() {
        System.out.println("Square.msg()");
    }
}///:~
