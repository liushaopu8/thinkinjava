//:chapter08_polymorphism/E03_NewShapeMethod.java
/*************  Exercise 03 ******************
 * Add a new method in the base class of Shapes.java
 * that prints a message, but dont' override  it
 * in he derived classes. Explain what happens.
 * Now overrideit in only one of derived classes
 * and see what happens. Finally override it in
 * all the derived classes.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.newshape.Circle;
import com.shao.think.chapter08_polymorphism.newshape.Shape;
import com.shao.think.chapter08_polymorphism.newshape.Square;
import com.shao.think.chapter08_polymorphism.newshape.Triangle;

public class E03_NewShapeMethod {
    public static void main(String[] args){
        Shape[] shapes = new Shape[]{
                new Circle(), new Square(), new Triangle()
        };
        for(Shape shape : shapes){
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}   /* Outpu:
Circle.draw()
Circle.erase()
Circle.msg()
Square.draw()
Square.erase()
Square.msg()
Triangle.draw()
Triangle.erase()
Triangle.msg()
*///:~
