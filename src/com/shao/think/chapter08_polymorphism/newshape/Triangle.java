//: chapter08_polymorphism.shape/Triangle.java
package com.shao.think.chapter08_polymorphism.newshape;

public class Triangle extends Shape {
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    public void erase(){
        System.out.println("Triangle.erase()");
    }
    public void msg(){
        System.out.println("Triangle.msg()");
    }
} ///:~
