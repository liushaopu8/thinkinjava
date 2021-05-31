package com.shao.think.chapter08_polymorphism.newshape;

public class Tetrahedron extends Shape{
    public void draw() {
        System.out.println("Tetrahedron.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Tetrahedron.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Tetrahedron.msg()");
    }
}
