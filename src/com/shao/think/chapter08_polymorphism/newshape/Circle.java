//:chapter08_polymorphism.shape/Circle.java
package com.shao.think.chapter08_polymorphism.newshape;

public class Circle extends Shape {
    public void draw(){
        System.out.println("Circle.draw()");
    }
    public void erase(){
        System.out.println("Circle.erase()");
    }
    public void msg(){
        System.out.println("Circle.msg()");
    }
}///:~
