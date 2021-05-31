//: chapter15_generics/.java
/*************** Exercise 144 ******************
 * Modify BasicGeneratorDemo.java to use the explicit
 * form of creation for the Generator(that is, use
 * the explicit constructor instead of the generic
 * create() method).
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.BasicGenerator;
import com.shao.think.util.CountedObject;
import com.shao.think.util.Generator;

public class E14_BasicGeneratorDemo2 {
    public static void main(String args[]){
        Generator<CountedObject> gen =
//        BasicGenerator.create(CountedObject.class);
                new BasicGenerator<CountedObject>(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}   /*  Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
 *///:~
