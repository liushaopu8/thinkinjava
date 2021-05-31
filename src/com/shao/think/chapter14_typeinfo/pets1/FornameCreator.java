package com.shao.think.chapter14_typeinfo.pets1;

import com.shao.think.chapter14_typeinfo.pets.Pet;
import com.shao.think.chapter14_typeinfo.pets.PetCreator;

import java.util.ArrayList;
import java.util.List;

public class FornameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "com.shao.think.chapter14_typeinfo.pets.Mutt",
            "com.shao.think.chapter14_typeinfo.pets.Pug",
            "com.shao.think.chapter14_typeinfo.pets.EgyptianMau",
            "com.shao.think.chapter14_typeinfo.pets.Manx",
            "com.shao.think.chapter14_typeinfo.pets.Cymric",
            "com.shao.think.chapter14_typeinfo.pets.Rat",
            "com.shao.think.chapter14_typeinfo.pets.Mouse",
            "com.shao.think.chapter14_typeinfo.pets.Hamster",
            "com.shao.think.chapter14_typeinfo.pets1.Gerbil"
    };

    static{
        try{
            for(String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
