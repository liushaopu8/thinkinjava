//: chapter14_typeinfo/E26_ClearSpitValve.java
/************************************************
 *  Implement clearSpitValve() as described in the
 *  summary
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

interface Instrument{
    void play();
    String what();
    void adjust();
    void prepareInstrument();
}
class Wind implements Instrument{
    @Override
    public void play() {
        Print.print("Wind.play()");
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }

    public void clearSpitValve(){
        Print.print("Wind.clearSpitValue");
    }

    @Override
    public void prepareInstrument() {clearSpitValve(); }
}

class Percussion implements Instrument {
    @Override
    public void play()  {
        Print.print("Percussion.play()");
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {

    }

    @Override
    public void prepareInstrument()   {
        Print.print("Percussion.prepareInstrument");
    }
}

class Stringed implements Instrument {
    @Override
    public void play()  {
        Print.print("Stringed.play()");
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }

    @Override
    public void prepareInstrument()    {
        Print.print("Stringed.prepareInstrument");
    }
}

class Brass extends Wind {
    @Override
    public void play()  {
        Print.print("Brass.play()");
    }

    @Override
    public void adjust()   {
        Print.print("Brass.adjust()");
    }

    @Override
    public void clearSpitValve()    {
        Print.print("Brass.clearSpitValve");
    }
}

class Woodwind extends Wind {
    @Override
    public void play()  {
        Print.print("Woodwind.play()");
    }

    @Override
    public String what() {
        return "WoodWind";
    }

    @Override
    public void clearSpitValve()    {
        Print.print("Woodwind.clearSpitValve");
    }
}

class Music5{
    static void tune(Instrument i){
        i.play();
    }

    static void tuneAll(Instrument[] e){
        for (Instrument instrument :
                e) {
            tune(instrument);
        }
    }

    static void prepareAll(Instrument[] e){
        for (Instrument instrument :
                e) {
            instrument.prepareInstrument();
        }
    }
}

public class E26_ClearSpitValve {
    public static void main(String [] args){
        Instrument[] orchestra = {
                new Wind(), new Percussion(),
                new Stringed(), new Brass(),
                new Woodwind(),
        };
        Music5.prepareAll(orchestra);
        Music5.tuneAll(orchestra);
    }
}   /*  Output:
*///:~
