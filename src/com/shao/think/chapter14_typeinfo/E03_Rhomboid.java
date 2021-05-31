//: chapter14_typeinfo/E03_Rhomboid.java
/***********************************************
 * Add Rhomboid to Shapes.java Create a Rhomboid,
 * upcast it to a Shape, then downcast it back to
 * Rhomboid. Try downcasting to a Circle and see
 * what happens.
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Rhomboid extends Shape{
    @Override
    public String toString() {
        return "Rhomboid";
    }
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{

    @Override
    public String toString() {
        return "Triangle";
    }
}

public class E03_Rhomboid {
    public static void main(String [] args){
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle(),
                new Rhomboid()
        );
        for(Shape shape: shapes)
            shape.draw();
        //upcast to shape;
        Shape shape = new Rhomboid();
        //downcast to Rhomboid
        Rhomboid r = (Rhomboid)shape;
        //Downcast to Circle. Succeeds at compile time,
        //but fails at runtime with a ClassCastException:
        //! Circle c = (Circle)shape;
    }
}   /*  Output:
Circle.draw()
Square.draw()
Triangle.draw()
Rhomboid.draw()
 *///:~
