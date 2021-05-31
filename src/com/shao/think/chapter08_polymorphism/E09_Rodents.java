//:chapter08_polymorphism/E09_Rodents.java
/*************  Exercise 09 ******************
 * Create an inheritance hierarchy of Rodent:
 * Mouse, Gerbil, Hamster, etc. In the base
 * class, provide methods that are common to all
 * Rodents and override these in the derived
 * classes to perform different behaviours
 * depending on the specific type of Rodent.
 * Create an array of Rodent, fill it with
 * different specific types of Rodents, and call
 * your base-class methods to see what happens.
 ********************************************/
package com.shao.think.chapter08_polymorphism;


import com.shao.think.util.Print;

class Rodent{
    public void hop(){
        Print.print("Rodent hopping");
    }

    public void scurry(){
        Print.print("Rodent scurrying");
    }

    public void reproduce(){
        Print.print("Making more Rodents");
    }

    public String toString(){
        return "Rodent";
    }
}

class Mouse extends Rodent{
    public void hop(){
        Print.print("Mouse hopping");
    }

    public void scurry(){
        Print.print("Mouse scurrying");
    }

    public void reproduce(){
        Print.print("Making more Mouse");
    }

    public String toString(){
        return "Mouse";
    }
}

class Gerbil extends Rodent{
    public void hop(){
        Print.print("Gerbil hopping");
    }

    public void scurry(){
        Print.print("Gerbil scurrying");
    }

    public void reproduce(){
        Print.print("Making more Gerbil");
    }

    public String toString(){
        return "Gerbil";
    }
}

class Hamster extends Rodent{
    public void hop(){
        Print.print("Hamster hopping");
    }

    public void scurry(){
        Print.print("Hamster scurrying");
    }

    public void reproduce(){
        Print.print("Making more Hamster");
    }

    public String toString(){
        return "Hamster";
    }
}

public class E09_Rodents {
    public static void main(String args[]){
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };
        for (Rodent r :
                rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            Print.print(r);
        }
    }
}   /* Output:
Mouse hopping
Mouse scurrying
Making more Mouse
Mouse
Gerbil hopping
Gerbil scurrying
Making more Gerbil
Gerbil
Hamster hopping
Hamster scurrying
Making more Hamster
Hamster
*///: ~
