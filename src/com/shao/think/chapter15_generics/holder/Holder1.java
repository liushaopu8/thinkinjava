package com.shao.think.chapter15_generics.holder;

//:generics/Holder1.java

public class Holder1 {
    private static Automombile a;
    public Holder1(Automombile a){ this.a = a;}
    Automombile get(){ return a; }

}///:~
