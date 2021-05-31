//: chapter07_reusing/E11_Delegation.java
/****************** Exercise 11 *******************
 * Modify Detergent.java so ituses delegation
 ************************************************/
package com.shao.think.chapter07_reusing;

class DetergentDelegation{
    private Cleanser cleanser = new Cleanser();
    // Delegated meethods:
    public void append(String a){ cleanser.append(a);}
    public void dilute(){ cleanser.dilute();}
    public void apply(){cleanser.apply();}
    public String toString(){ return cleanser.toString();}
    public void scub(){
        append(" DetergenDelegation.scrub()");
        cleanser.scrub();
    }
    public void foam(){ append( " foam()");}
    public static void main(String[] args){
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class: ");
        Cleanser.main(args);
    }
}
public class E11_Delegation {
    public static void main(String[] args){
        DetergentDelegation.main(args);
    }
}/* Output:
Cleanser dilute() apply() DetergenDelegation.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
