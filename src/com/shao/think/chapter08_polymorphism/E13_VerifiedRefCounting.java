//:chapter08_polymorphism/E13_VerifiedRefCounting.java
/*************  Exercise 13 ******************
 * Add a finalize() method to ReferenceCountin.java
 * to verify the termination condition. (See
 * the Initialization & Cleanup chapter))
 ********************************************/
package com.shao.think.chapter08_polymorphism;

import com.shao.think.util.Print;

class Shared  {
    private int refcount = 0;
    private static int counter = 0;
    private int id = counter++;
    public Shared(){
        Print.print("Createing " + this);
    }
    public void addRef(){ refcount++;}
    protected void dispose(){
        if(--refcount == 0){
            Print.print("Disposing " + this);
        }
    }

    protected void finalize(){
        if(refcount != 0){
            Print.print("Error: object is not properly cleaned-up!");
        }
    }
    public String toString(){
        return "Shared " + id;
    }
}

class Composing  {
    private Shared shared;
    private static int counter = 0;
    private int id = counter++;
    public Composing(Shared shared){
        Print.print("Createing " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        Print.print("disposing " + this);
        shared.dispose();
    }
    public String toString(){
        return "Composing " + id;
    }
}

public class E13_VerifiedRefCounting {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };
        for (Composing c :
                composing) {
            c.dispose();
        }
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
}   /* Outpu:
Createing Shared 0
Createing Composing 0
Createing Composing 1
Createing Composing 2
Createing Composing 3
Createing Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
Createing Shared 1
Createing Composing 5
Error: object is not properly cleaned-up!
*///:~
