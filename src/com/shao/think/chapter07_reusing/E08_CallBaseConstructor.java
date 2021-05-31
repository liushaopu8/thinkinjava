//: chapter07_reusing/E08_CallBaseConstructor.java
/****************** Exercise 8 *******************
 * Create a base class with only a non-defualt
 * constructor, and a derived class with both a
 * default(no-arg) and non-default constructor.
 * Call the base-class constructor in the derived-calss
 * constructors.
 ************************************************/
package com.shao.think.chapter07_reusing;

class BaseNonDefault{
    public BaseNonDefault(int i){}
}

class DerivedConstructors extends BaseNonDefault{
    public DerivedConstructors(){ super(47);}
    public DerivedConstructors(int i){super(i);}
}

public class E08_CallBaseConstructor {
    public static void main(String args[]){
        new DerivedConstructors();
        new DerivedConstructors(74);
    }
}///:~
