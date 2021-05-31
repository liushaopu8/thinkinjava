//:chapter09_interfaces/E09_AbstractMusic5.java
/***************** Exercise 09 ********************
* Refactor Music5.java by moving the common methods
 * in Wind, Percussion and Stringed into an abstract
 * class
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.chapter08_polymorphism.music.Note;
import com.shao.think.util.Print;

abstract class Instrument{
    public void play(Note n){
        Print.print(this + ".play() " + n);
    }
    public void adjust(){
        Print.print(this + ".adjust()");
    }
    public abstract String toString();
}

class Wind extends Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Instrument {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Instrument {
    public String toString() {
        return "Woodwind";
    }
}


public class E09_AbstractMusic5 {
    public static void main(String[] args){
        Instrument[] orchestra ={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }

    static void tuneAll(Instrument[] orchestra) {
        for (Instrument i :
                orchestra) {
            i.adjust();
            i.play(Note.MIDDLE_C);
        }
    }


}/* Output:
Wind.adjust()
Wind.play() MIDDLE_C
Percussion.adjust()
Percussion.play() MIDDLE_C
Stringed.adjust()
Stringed.play() MIDDLE_C
Brass.adjust()
Brass.play() MIDDLE_C
Woodwind.adjust()
Woodwind.play() MIDDLE_C
*///:~
