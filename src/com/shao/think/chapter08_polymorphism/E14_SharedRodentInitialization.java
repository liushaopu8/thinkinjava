//:chapter08_polymorphism/E14_SharedRodentInitialization.java
/*************  Exercise 14 ******************
 * Modify Exercise 12 so one of the member
 * objects is a shared object with reference
 * counting, and demonstrate that it works
 * properly.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.util.Print;

class NonSharedMember {
    public NonSharedMember(String id) {
        Print.print("Non shared member constructor " + id);
    }
}

class SharedMember {
    private int refcount;
    public void addRef() {
        Print.print("Number of references " + ++refcount);
    }

    public void dispose() {
        if(--refcount == 0){
            Print.print("Disposing " + this);
        }
    }

    public SharedMember(){
        Print.print("Shared member constructor");
    }

    public String toString(){
        return "Shared member";
    }
}
class Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("r1"),
            m2 = new NonSharedMember("r2");
    public Rodent3(SharedMember sm){
        Print.print("Rodent3 consturctor");
        m = sm;
        m.addRef();
    }

    public void hop(){
        Print.print("Rodent3 hop");
    }

    public void scurry(){
        Print.print("Rodent3 scurry");
    }

    public void reproduce(){
        Print.print("Making more redent3");
    }

    public void dispose() {
        Print.print("Disposing " + this);
        m.dispose();
    }
    public String toString(){
        return "Rodent3";
    }

}

class Hamster3 extends Rodent3{
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("h1"),
            m2 = new NonSharedMember("h2");

    Hamster3(SharedMember sm){
        super(sm);
        Print.print("Hamster3 constructor");
    }

    public void hop() {
        Print.print("Haster3 hopping");
    }

    public void scurry(){
        Print.print("Hamster3 scurry");
    }

    public void reproduce() {
        Print.print("Making more Hamster3");
    }
    public String toString(){
        return "Hamster3";
    }
}

class Gerbil3 extends Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("h1"),
            m2 = new NonSharedMember("h2");

    Gerbil3(SharedMember sm){
        super(sm);
        Print.print("Gerbil3 constructor");
    }

    public void hop() {
        Print.print("Gerbil3 hopping");
    }

    public void scurry(){
        Print.print("Gerbil3 scurry");
    }


    public void reproduce() {
        Print.print("Making more Gerbil3");
    }
    public String toString(){
        return "Gerbil3";
    }
}

class Mouse3 extends Rodent3 {
    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("h1"),
            m2 = new NonSharedMember("h2");

    Mouse3(SharedMember sm){
        super(sm);
        Print.print("Mouse3 constructor");
    }

    public void hop() {
        Print.print("Mouse3 hopping");
    }

    public void scurry(){
        Print.print("Mouse3 scurry");
    }


    public void reproduce() {
        Print.print("Making more Mouse3");
    }

    public String toString(){
        return "Mouse3";
    }
}

public class E14_SharedRodentInitialization {
    public static void main(String args[]) {
        SharedMember sm = new SharedMember();
        Rodent3[] rodents = {
                new Hamster3(sm),
                new Gerbil3(sm),
                new Mouse3(sm),
        };

        for (Rodent3 r : rodents) {
            r.dispose();
        }
    }

}   /* Output:
Shared member constructor
Non shared member constructor r1
Non shared member constructor r2
Rodent3 constructor
Number of references 1
Non shared member constructor h1
Non shared member constructor h2
Hamster3 constructor
Non shared member constructor r1
Non shared member constructor r2
Rodent3 constructor
Number of references 2
Non shared member constructor g1
Non shared member constructor g2
Gerbil3 constructor
Non shared member constructor r1
Non shared member constructor r2
Rodent3 constructor
Number of references 3
Non shared member constructor m1
Non shared member constructor m2
Mouse3 constructor
Disposing Hamster3
Disposing Gerbil3
Disposing Mouse3
Disposing Shared member
*///:~
