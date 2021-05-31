//:chapter09_interfaces/.java
/***************** Exercise  ********************
 * Follow theform of the order interfaces to add an
 * interface called CanClimb to adventure.java
 *************************************************/
package com.shao.think.chapter09_interfaces;

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

class ActionCharacter{
    public void fight(){}
}

class Hero2 extends ActionCharacter implements
        CanFight,CanSwim,CanFly,CanClimb{

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }

    @Override
    public void fly() {

    }
}

public class E12_CanClimb {
    public static void main(String[] args){
        Hero2 h = new Hero2();
        t(h);
        u(h);
        v(h);
        z(h);
        w(h);
    }

    private static void t(CanFight x) {
        x.fight();
    }
    private static void u(CanSwim x) {
        x.swim();
    }
    private static void v(CanFly x) {
        x.fly();
    }
    private static void z(CanClimb x) {
        x.climb();
    }
    private static void w(ActionCharacter x) {
        x.fight();
    }


}///:~
