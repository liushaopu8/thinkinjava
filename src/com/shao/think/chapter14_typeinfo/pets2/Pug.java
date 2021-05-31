package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Dog;

public class Pug extends Dog {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Pug>{
        @Override
        public Pug create() {
            return new Pug();
        }
    }
}
