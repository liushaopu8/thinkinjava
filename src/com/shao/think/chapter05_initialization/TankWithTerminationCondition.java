//: chapter05_initialization/TankWithTerminationCondition.java
/****************** Exercise 12 *******************
 *  Create a class called Tank that can be filled
 *  and emptied, with a termination condition that it
 *  must be empty when the object is cleaned up.
 *  write a finalize() that verifies this termination
 *  condition. In main(), test the  possible scenarios
 *  that can occur when you use Tank.
 **************************************************/
package com.shao.think.chapter05_initialization;

class Tank{
    static int counter;
    int id = counter++;
    boolean full;
    public Tank(){
        System.out.println("Tank " + id + " created");
        full = true;
    }
    public void empty() { full = false; }
    protected void finalize(){
        if(full)
            System.out.println("Error: tank " + id + " must be empty at cleanup");
        else
            System.out.println("Tank " + id + " clean up OK");
    }
    public String toString(){
        return "Tamk " + id;
    }
}
public class TankWithTerminationCondition {
    public static void main(String[] args){
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
} /*  Output:
Tank 0 created
Tank 1 created
Error: tank 1 must be empty at cleanup
Tank 0 clean up OK
*///: ~
