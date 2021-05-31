package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.pets.Cat;

class EgyptianMau extends Cat {
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<EgyptianMau>{
        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}
