//:chapter08_polymorphism/E12_RodentInitialization.java
/*************  Exercise 12 ******************
 * Modify Exercise 9 so it demonstrates the order
 * of initialization of the base classes and
 * derived classes. Now add member objects to
 * both the base and derived classes, and show
 * the order in which their initialization occurs
 * during construction.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.util.Print;

class Member{
    public Member(String id){
        Print.print("Member constructor " + id);
    }
}

class Rodent2{
    Member m1 = new Member("r1"), m2 = new Member("r2");
    public Rodent2(){
        Print.print("Rodent2 constructor");
    }

    public void hop(){
        Print.print("Rodent2 hopping");
    }

    public void scurry(){
        Print.print("Rodent2 scurry");
    }

    public void reproduce(){
        Print.print("Making more Rodents");
    }

    public String toString(){
        return "Rodent2";
    }
}

class Mouse2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");
    public Mouse2(){
        Print.print("Mouse2 constructor");
    }

    public void hop(){
        Print.print("Mouse2 hopping");
    }

    public void scurry(){
        Print.print("Mouse2 scurry");
    }

    public void reproduce(){
        Print.print("Making more Mouse2");
    }

    public String toString(){
        return "Mouse2";
    }
}

class Gerbil2 extends Rodent2 {
    Member m1 = new Member("g1"), m2 = new Member("g2");
    public Gerbil2(){
        Print.print("Gerbil2 constructor");
    }

    public void hop(){
        Print.print("Gerbil2 hopping");
    }

    public void scurry(){
        Print.print("Gerbil2 scurry");
    }

    public void reproduce(){
        Print.print("Making more Gerbil2");
    }

    public String toString(){
        return "Gerbil2";
    }
}

class Hamster2 extends Rodent2 {
    Member m1 = new Member("h1"), m2 = new Member("h2");
    public Hamster2(){
        Print.print("Hamster2 constructor");
    }

    public void hop(){
        Print.print("Hamster2 hopping");
    }

    public void scurry(){
        Print.print("Hamster2 scurry");
    }

    public void reproduce(){
        Print.print("Making more Hamster2");
    }

    public String toString(){
        return "Hamster2";
    }
}

public class E12_RodentInitialization {
    public static void main(String[] args){
        new Hamster2();
    }

}   /* Output:
Member constructor r1
Member constructor r2
Rodent2 constructor
Member constructor h1
Member constructor h2
Hamster2 constructor
*///:~
