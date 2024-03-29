package com.shao.think.chapter14_typeinfo;

import com.shao.think.chapter14_typeinfo.pets.*;
import com.shao.think.chapter14_typeinfo.pets1.FornameCreator;
import com.shao.think.chapter14_typeinfo.pets1.Gerbil;
import com.shao.think.util.Print;

import java.util.HashMap;

public class E11_PetCount {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if(quantity == null)
                put(type,1);
            else
                put(type,quantity + 1);
        }
    }
    public static void countPets(PetCreator creator){
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            //List each individual pet:
            Print.print(pet.getClass().getSimpleName() + "  ");
            if(pet instanceof Pet)
                counter.count("Pet");
            if(pet instanceof Dog)
                counter.count("Dog");
            if(pet instanceof Mutt)
                counter.count("Mutt");
            if(pet instanceof Pug)
                counter.count("Pug");
            if(pet instanceof Cat)
                counter.count("Cat");
            if(pet instanceof Manx)
                counter.count("Manx");
            if(pet instanceof Manx)
                counter.count("EgyptianMau");
            if(pet instanceof Manx)
                counter.count("Cymric");
            if(pet instanceof Rodent)
                counter.count("Rodent");
            if(pet instanceof Rat)
                counter.count("Rat");
            if(pet instanceof Mouse)
                counter.count("Mouse");
            if(pet instanceof Hamster)
                counter.count("Hamster");
            if(pet instanceof Gerbil)
                counter.count("Gerbil");
        }
        //Show the counts:
        Print.print(counter);
    }
    public static void main(String[] args){
        countPets(new FornameCreator());
    }
} /*    Output:
EgyptianMau
Gerbil
Cymric
EgyptianMau
Cymric
EgyptianMau
Pug
Rat
Mutt
Cymric
Manx
Manx
Manx
Cymric
EgyptianMau
Pug
Hamster
Cymric
Gerbil
Pug
{EgyptianMau=8, Pug=3, Cymric=8, Rat=1, Cat=4, Manx=8, Rodent=4, Mutt=1, Gerbil=2, Dog=4, Pet=20, Hamster=1}
*///:~
