package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Cat;

public class Manx extends Cat {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Manx>{
        @Override
        public Manx create() {
            return new Manx();
        }
    }
}
