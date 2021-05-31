//:chapter09_interfaces/E10_PlayableMusic5.java
/***************** Exercise  ********************
* Add a Playable to Modify Music5.java, and move
 * the play() declaration from Instrument to Playable
 * Include Playable in the implements list to add it
 * to the derived classes. Change tune() so it takes a
 * Playable instead of an Instrument.
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.chapter08_polymorphism.music.Note;
import com.shao.think.util.Print;

interface Instrument2{
    void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind2 implements Instrument2,Playable {
    @Override
    public void adjust() {
        Print.print(this + ".adjust()");
    }

    @Override
    public void play(Note n) {
        Print.print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind2";
    }
}

class Percussion2 implements Instrument2,Playable {
    @Override
    public void adjust() {
        Print.print(this + ".adjust()");
    }

    @Override
    public void play(Note n) {
        Print.print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion2";
    }
}

class Stringed2 implements Instrument2,Playable {
    @Override
    public void adjust() {
        Print.print(this + ".adjust()");
    }

    @Override
    public void play(Note n) {
        Print.print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed2";
    }
}

class Brass2 extends Wind2 {
    public String toString() {
        return "Brass2";
    }
}

class Woodwind2 extends Wind2 {
    @Override
    public String toString() {
        return "Woodwind2";
    }
}

public class E10_PlayableMusic5 {
    public static void main(String[] args){
        Playable[] orchestra = {
                new Wind2(),
                new Percussion2(),
                new Stringed2(),
                new Brass2(),
                new Woodwind2(),
        };
        tunAll(orchestra);
    }

    private static void tunAll(Playable[] orchestra) {
        for (Playable p:
             orchestra) {
            p.play(Note.MIDDLE_C);
        }
    }
}/* Output:
Wind2.play() MIDDLE_C
Percussion2.play() MIDDLE_C
Stringed2.play() MIDDLE_C
Brass2.play() MIDDLE_C
Woodwind2.play() MIDDLE_C
*///:~
