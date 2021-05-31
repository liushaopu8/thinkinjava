//: chapter14_typeinfo/E06_Highlight.java
/***********************************************
 * Modify Shapes.java so that it can "highlight"
 * (set a flag) in all shapes of a particular
 * type. The toString() method for each derived
 * Shape should indicate whether that Shape is
 * "highlighted"
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HShape{
    boolean highlighted = false;
    public void highlight(){ highlighted = true;}
    public void clearHighlight(){ highlighted = false;}
    void draw(){
        System.out.println(this + " draw()");
    }
    public String toString(){
        return getClass().getName() +
                (highlighted ? " highlighted" : " normal");
    }

    static List<HShape> shapes = new ArrayList<HShape>();
    HShape() {shapes.add(this);}

    static void highlight1(Class<?> type) {
        for(HShape shape : shapes)
            if(type.isInstance(shape))
                shape.highlight();
    }
    static void clearHighlight1(Class<?> type){
        for (HShape shape :
                shapes) {
            if(type.isInstance(shape))
                shape.clearHighlight();
        }
    }

    static void foreach(Class<?> type, String method) {
        try {
            Method m = HShape.class.getMethod(method,(Class<?>[])null);
            for(HShape shape : shapes)
                if(type.isInstance(shape))
                    m.invoke(shape,(Object[])null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    static void highlight2(Class<?> type){
        foreach(type, "highlight");
    }

    static void clearHighlight2(Class<?> type){
        foreach(type,"clearHighlight");
    }
}

class HCircle extends HShape{}
class HSquare extends HShape{}
class HTriangle extends HShape{}

public class E06_Highlight {
    public static void main(String [] args) {
        List<HShape> shapes = Arrays.asList(
                new HCircle(), new HSquare(),
                new HTriangle(), new HSquare(),
                new HTriangle(), new HCircle(),
                new HCircle(), new HSquare());
        HShape.highlight1(HCircle.class);
        HShape.highlight2(HCircle.class);
        for(HShape shape : shapes)
            shape.draw();
        System.out.println("*********************");
        // Highlight them all:
        HShape.highlight1(HShape.class);
        HShape.highlight2(HShape.class);
        for(HShape shape : shapes)
            shape.draw();
        System.out.println("*********************");
        // Not in theh hierarchy:
        HShape.clearHighlight1(ArrayList.class);
        HShape.clearHighlight2(ArrayList.class);
        for(HShape shape: shapes)
            shape.draw();
    }
}   /*  Output:
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare normal draw()
com.shao.think.chapter14_typeinfo.HTriangle normal draw()
com.shao.think.chapter14_typeinfo.HSquare normal draw()
com.shao.think.chapter14_typeinfo.HTriangle normal draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare normal draw()
*********************
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()
com.shao.think.chapter14_typeinfo.HTriangle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()
com.shao.think.chapter14_typeinfo.HTriangle highlighted draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()
*********************
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()
com.shao.think.chapter14_typeinfo.HTriangle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()
com.shao.think.chapter14_typeinfo.HTriangle highlighted draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HCircle highlighted draw()
com.shao.think.chapter14_typeinfo.HSquare highlighted draw()

 *///:~
