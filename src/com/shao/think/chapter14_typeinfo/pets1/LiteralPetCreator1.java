package com.shao.think.chapter14_typeinfo.pets1;

import com.shao.think.chapter14_typeinfo.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator1 extends PetCreator {

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class,Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class,
                    Gerbil.class
            ));
    //Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args){
        System.out.println(types);
    }
} /* Output:
[class com.shao.think.chapter14_typeinfo.pets.Mutt,
class com.shao.think.chapter14_typeinfo.pets.Pug,
class com.shao.think.chapter14_typeinfo.pets.EgyptianMau,
class com.shao.think.chapter14_typeinfo.pets.Manx,
class com.shao.think.chapter14_typeinfo.pets.Cymric,
class com.shao.think.chapter14_typeinfo.pets.Rat,
class com.shao.think.chapter14_typeinfo.pets.Mouse,
class com.shao.think.chapter14_typeinfo.pets.Hamster,
class com.shao.think.chapter14_typeinfo.pets1.Gerbil]
*///: ~
