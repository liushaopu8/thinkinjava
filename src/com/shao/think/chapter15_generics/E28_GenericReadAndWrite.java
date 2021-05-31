//: chapter15_generics/.java
/*************** Exercise 28 *******************
 * Create a generic class Generic<T> with a single
 * method that takes an argument of type T.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter14_typeinfo.pets.Cat;
import com.shao.think.chapter14_typeinfo.pets.Mouse;
import com.shao.think.chapter14_typeinfo.pets.Pet;
import com.shao.think.chapter14_typeinfo.pets.Rodent;
import com.shao.think.util.Generator;

class Generic1<T>{
    public void set(T arg){}
}
class Generic2<T>{
    public T get(){return null;}
}

public class E28_GenericReadAndWrite {
    static<T> void f1(Generic1<? super T> obj, T item){
        obj.set(item);
    }
    static <T> T f2(Generic2<? extends T>obj){
        return obj.get();
    }

    public static void main(String args[]){
        Generic1<Rodent> g1 = new Generic1<>();
        f1(g1,new Mouse());
        /*
            Compile error: cat is not a rodent
            f1(g1, new Cat());
         */

        Generic2<Pet> g2 = new Generic2<>();
        Pet pet = f2(g2);
        Generic2<Cat> g3 = new Generic2<>();
        Cat cat = f2(g3);
        pet = f2(g3);

    }
}   /*  Output:
 *///:~
