//:chapter09_interfaces/E07_RodentInterface.java
/***************** Exercise 07 ********************
 * Change Rodent to an interface in Exercise 9 of
 * the Polymorphism chapter
 *************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

interface Rodent2{
    void hop();
    void scurry();
    void reproduce();
}

class Mouse2 implements Rodent2{

    @Override
    public void hop() {
        Print.print("Mouse2 hopping");
    }

    @Override
    public void scurry() {
        Print.print("Mouse2 scurry");
    }

    @Override
    public void reproduce() {
        Print.print("Making more mice");
    }

    public String toString(){
        return "Mouse2";
    }
}

class Gerbil2 implements Rodent2{

    @Override
    public void hop() {
        Print.print("Gerbil2 hopping");
    }

    @Override
    public void scurry() {
        Print.print("Gerbil2 scurry");
    }

    @Override
    public void reproduce() {
        Print.print("Making more Gerbil2s");
    }

    public String toString(){
        return "Gerbil2";
    }
}

class Hamster2 implements Rodent2{

    @Override
    public void hop() {
        Print.print("Hamster2 hopping");
    }

    @Override
    public void scurry() {
        Print.print("Hamster2 scurry");
    }

    @Override
    public void reproduce() {
        Print.print("Making more Hamster2s");
    }

    public String toString(){
        return "Hamster2";
    }
}

public class E07_RodentInterface {
    public static void main(String[] args){
        Rodent2[] rodents = {
            new Mouse2(),
            new Gerbil2(),
            new Hamster2(),
        };
        for (Rodent2 r :
                rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            Print.print(r);
        }
    }
}/* Output:
Mouse2 hopping
Mouse2 scurry
Making more mice
Mouse2
Gerbil2 hopping
Gerbil2 scurry
Making more Gerbil2s
Gerbil2
Hamster2 hopping
Hamster2 scurry
Making more Hamster2s
Hamster2
*///:~
