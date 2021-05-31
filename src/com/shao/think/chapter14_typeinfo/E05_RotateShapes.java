//: chapter14_typeinfo/E05_RotateShapes.java
/***********************************************
 * Implement a rotate(Shape) method in Shapes.jva
 * such that it checks to see if it is rotating a
 * Circle(and, if so, doesn't perform the operation).
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class RShape{
    void draw(){ System.out.println(this + ".draw()");}
    abstract public String toString();
    void rotate(int degrees){
        System.out.println("Rotateing " + this + " by " + degrees + " degrees");
    }
}

class RCircle extends RShape{

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    void rotate(int degrees) {
        throw new UnsupportedOperationException();
    }
}

class RSquare extends RShape{

    @Override
    public String toString() {
        return "Square";
    }
}

class RTriangle extends RShape{

    @Override
    public String toString() {
        return "Triangle";
    }
}

public class E05_RotateShapes {
    public static void main(String [] args){
        List<RShape> shapes = Arrays.asList(
                new RCircle(), new RSquare(),new RTriangle()
        );
        rotateAll(shapes);
    }

    private static void rotateAll(List<RShape> shapes) {
        for (RShape shape :
                shapes) {
            if (!(shape instanceof RCircle))
                shape.rotate(45);
        }
    }
}   /*  Output:
Rotateing Square by 45 degrees
Rotateing Triangle by 45 degrees
 *///:~
