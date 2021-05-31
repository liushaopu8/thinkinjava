package com.shao.think.chapter14_typeinfo.coffee2;

public class Mocha extends Coffee {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Mocha> {
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
}
