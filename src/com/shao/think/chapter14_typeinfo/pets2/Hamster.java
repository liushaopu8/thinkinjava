package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Rodent;

public class Hamster extends Rodent {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Hamster>{
        @Override
        public Hamster create() {
            return new Hamster();
        }
    }
}
