package com.shao.think.chapter14_typeinfo.coffee2;

public class Cappucino extends Coffee{

    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Cappucino>{
        @Override
        public Cappucino create() {
            return new Cappucino();
        }
    }

}
