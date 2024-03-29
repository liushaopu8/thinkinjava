//:chapter08_polymorphism/E07_NewInstrment.java
/*************  Exercise 07 ******************
 * Add a new type of Instrument to Music3.java
 * and verify that polymorphism works for your
 * new type.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.chapter08_polymorphism.music.Note;

class Electronic extends Instrument{
    void play(Note n) {
        System.out.println("Electronic.play() " + n);
    }
    public String toString(){
        return "Electronic";
    }
}

public class E07_NewInstrment {
    static Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind(),
            new Electronic()
    };
    public static void main(String[] args){
        for (Instrument i :
                orchestra) {
            i.play(Note.MIDDLE_C);
            i.adjust();
            System.out.println(i);
        }
    }
}   /* Output:
Wind.play() MIDDLE_C
Wind
Percussion.play() MIDDLE_C
Percussion
Stringed.play() MIDDLE_C
Stringed
Brass.play() MIDDLE_C
Brass.adjust()
Wind
Woodwind.play() MIDDLE_C
Woodwind
Electronic.play() MIDDLE_C
Electronic
*///:~
