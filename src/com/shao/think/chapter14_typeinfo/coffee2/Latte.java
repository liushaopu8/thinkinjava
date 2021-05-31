package com.shao.think.chapter14_typeinfo.coffee2;

public class Latte extends Coffee {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Latte> {
        @Override
        public Latte create() {
            return new Latte();
        }
    }
}
