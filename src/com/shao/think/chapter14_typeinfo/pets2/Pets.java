package com.shao.think.chapter14_typeinfo.pets2;

import com.shao.think.chapter14_typeinfo.factory.Factory;
import com.shao.think.chapter14_typeinfo.pets.Pet;
import com.shao.think.chapter14_typeinfo.pets.PetCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pets {
    private static Random rand = new Random(47);

    private static class RFPetCreator extends PetCreator{
        static List<Factory<? extends Pet>> petFactories =
                Arrays.asList(new Mutt.Factory(), new Pug.Factory(),
                        new EgyptianMau.Factory(), new Manx.Factory(),
                        new Cymric.Factory(), new Rat.Factory(),
                        new Mouse.Factory(), new Hamster.Factory());
        @Override
        public List<Class<? extends Pet>> types() {
            return null;
        }

        @Override
        public Pet randomPet() {//Make 1 random Pet
            int n = rand.nextInt(petFactories.size());
            return petFactories.get(n).create();
        }
    }

    public static final PetCreator creator = new RFPetCreator();

    public static Pet randomPet(){
        return creator.randomPet();
    }

    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
