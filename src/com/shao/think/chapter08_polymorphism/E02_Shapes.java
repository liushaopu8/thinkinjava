//:chapter08_polymorphism/E02_Shapes.java
/*************  Exercise 02 ******************
 * Add teh @Override annotation to the shapes
 * example.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.shape.RandomShapeGenerator;
import com.shao.think.chapter08_polymorphism.shape.Shape;

public class E02_Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp: s) {
            shp.draw();
        }
    }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
