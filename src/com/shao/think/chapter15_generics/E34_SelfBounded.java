//: chapter15_generics/.java
/*************** Exercise 34 *******************
* Create a self-bounded generic type that contains
 * an abstract method that takes an argument of
 * the generic type parameter and produces a return
 * value of the generic type parameter. In a non-abstract
 * method of the class, call the abstract method and
 * return its result. Inherit from the self-bounded
 * type and test the resulting class.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

abstract class
GenericProcessor<T extends GenericProcessor<T>>{
    abstract T process(T arg);
    T test(){ return process(null);}
}

class ConcreteProcessor
extends GenericProcessor<ConcreteProcessor>{

    @Override
    ConcreteProcessor process(ConcreteProcessor arg) {
        if(arg == null) return this;
        return arg;
    }
}
public class E34_SelfBounded {
    public static void main(String args[]){
        ConcreteProcessor cp = new ConcreteProcessor();
        Print.print(cp == cp.test());
    }
}   /*  Output:
 *///:~
