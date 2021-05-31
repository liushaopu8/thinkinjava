package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Rodent;

public class Rat extends Rodent {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Rat>{
        @Override
        public Rat create() {
            return new Rat();
        }
    }
}
