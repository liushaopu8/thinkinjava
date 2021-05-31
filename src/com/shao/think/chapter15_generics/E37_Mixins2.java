//: chapter15_generics/.java
/*************** Exercise 37 *******************
* Add a new mixin class Colored to Mixins.java
 * mix it in to Mixin, and show that it works
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.awt.*;
import java.util.Date;
import java.util.Random;

interface Colored { Color getColor();}

class ColoredImp implements Colored{
    private static Random rand = new Random(47);
    private final Color clr = new Color(rand.nextInt(177216));

    @Override
    public Color getColor() {
        return clr;
    }
}

interface Basic{
    public void set(String val);
    public String get();
}
class BasicImp implements Basic{

    private String value;
    @Override
    public void set(String val) {
        value = val;
    }

    @Override
    public String get() {
        return value;
    }
}

interface TimeStamped{
    long getStamp();
}
class TimeStampedImp implements TimeStamped{
    private final long timeStamp;
    public TimeStampedImp(){
        timeStamp = new Date().getTime();
    }
    @Override
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered{
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;
    @Override
    public long getSerialNumber() {
        return serialNumber;
    }
}

class Mixin extends BasicImp
implements TimeStamped, SerialNumbered{
    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumber =
            new SerialNumberedImp();

    @Override
    public long getStamp() {
        return timeStamp.getStamp();
    }

    @Override
    public long getSerialNumber() {
        return serialNumber.getSerialNumber();
    }
}
class Mixin2 extends Mixin implements Colored{
    private Colored colored = new ColoredImp();
    @Override
    public Color getColor() {
        return colored.getColor();
    }
}
public class E37_Mixins2 {
    public static void main(String args[]){
        Mixin2 mixin1 = new Mixin2(), mixin2 = new Mixin2();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        Print.print(mixin1.get() + " " +
                mixin1.getStamp() + " " +
                mixin1.getSerialNumber() + " " + mixin1.getColor());
        Print.print(mixin2.get() + " " +
                mixin2.getStamp() + " " +
                mixin2.getSerialNumber() + " " + mixin2.getColor());
    }
}   /*  Output:
 *///:~
