package com.shao.think.chapter14_typeinfo.coffee2;

public class Breve extends Coffee {
    public static class Factory
    implements com.shao.think.chapter14_typeinfo.factory.Factory<Breve>{
        @Override
        public Breve create() {
            return new Breve();
        }
    }
}
