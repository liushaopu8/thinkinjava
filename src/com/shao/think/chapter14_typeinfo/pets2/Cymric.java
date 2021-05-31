//: chapter14_typeinfo/pets/Cymric.java
/***********************************************
 * Modify the Coffee hierarchy in the Generics
 * chapter to use Registered Factories.
 ***********************************************/
package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Cat;
import com.shao.think.chapter14_typeinfo.pets.Manx;

public class Cymric extends Manx {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Cymric>{
        @Override
        public Cymric create() {
            return new Cymric();
        }
    }
}


