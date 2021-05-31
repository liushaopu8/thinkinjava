//:chapter09_interfaces/E01_AbstractRodent.java
/*****************  Exercise 1  ********************
 *  Modify Exercise 9 in the previous chapter so Rodent
 *  is an abstract class. Make the methods of Rodent
 *  abstract whenever possible.
 **************************************************/
package com.shao.think.chapter09_interfaces;

import com.shao.think.util.Print;

abstract class Rodent{
    public abstract void hop();
    public abstract void scurry();
    public abstract void reproduce();
}

class Mouse extends Rodent{
    @Override
    public void hop() {
        Print.print("Mouse hopping");
    }
    public void scurry() {
        Print.print("Mouse scurry");
    }
    public void reproduce() {
        Print.print("Making more Mice");
    }
    public String toString(){
        return "Mouse";
    }
}

class Gerbil extends Rodent{
    public void hop() {
        Print.print("Gerbil hopping");
    }
    @Override
    public void scurry() {
        Print.print("Gerbil scurry");
    }
    public void reproduce() {
        Print.print("Making more Gerbils");
    }
    public String toString(){
        return "Gerbil";
    }
}

class Hamster extends Rodent{
    public void hop() {
        Print.print("Hamster hopping");
    }
    public void scurry() {
        Print.print("Hamster scurry");
    }
    @Override
    public void reproduce() {
        Print.print("Making more Hamsters");
    }
    public String toString(){
        return "Hamster";
    }
}


public class E01_AbstractRodent {
    public static void main(String[] args){
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
}/* Output:
Mouse hopping
Mouse scurry
Making more Mice
Mouse
Gerbil hopping
Gerbil scurry
Making more Gerbils
Gerbil
Hamster hopping
Hamster scurry
Making more Hamsters
Hamster

Note the root class method Object.toString() can be left out of the abstract base class
*///:~
