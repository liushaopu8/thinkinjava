package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Rodent;

public class Mouse extends Rodent {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<Mouse>{
        @Override
        public Mouse create() {
            return new Mouse();
        }
    }
}
