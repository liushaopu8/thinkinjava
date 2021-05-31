package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Dog;

public class Mutt extends Dog {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Mutt>{
        @Override
        public Mutt create() {
            return new Mutt();
        }
    }
}
