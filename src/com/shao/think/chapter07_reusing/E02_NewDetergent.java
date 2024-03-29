//: chapter07_reusing/.java
/****************** Exercise 2 *******************
 * Inherit a new class from class Detergent.
 * Override scrub() and add a new method called
 * sterilize().
 ************************************************/
package com.shao.think.chapter07_reusing;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a){   s += a;}
    public void dilute(){ append(" dilute()");}
    public void apply() { append(" apply()");}
    public void scrub(){ append(" scrub()"); }
    public String toString(){ return s;}
    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser{
    public void scrub(){
        append(" Detergent.scrub");
        super.scrub();
    }
    public void foam(){ append(" foam()");}
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println(" Testing base class: ");
        Cleanser.main(args);
    }
}

class NewDetergent extends Detergent{
    public void scrub(){
        append(" NewDetergent.scrub()");
        super.scrub();
    }
    public void sterilize(){ append(" sterilize()"); }
}

public class E02_NewDetergent extends Detergent{
    public static void main(String args[]){
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
    }
}/* Output:
Cleanser dilute() NewDetergent.scrub() Detergent.scrub scrub() sterilize()
*///:~


