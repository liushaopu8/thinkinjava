//: chapter15_generics/.java
/*************** Exercise 40 *******************
* Add a speak() method to all the pets in
 * chapter14_typeinfo.pets. Modify Apply.java to call the
 * speak() method foa a heterogeneous collection
 * of Pet.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter14_typeinfo.pets.Individual;
import com.shao.think.util.Print;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class SPet extends Individual {
    public SPet(String name){ super(name);}
    public SPet() { super();}
    public void speak(){
        Print.print(this + " speak");
    }
}

class SDog extends SPet{
    public SDog(String name){ super(name);}
    public SDog(){ super();}
}

class SPug  extends SDog {
    public SPug(String name){ super(name);}
    public SPug(){ super();}
}
class SMutt  extends SDog {
    public SMutt(String name){ super(name);}
    public SMutt(){ super();}
}
class SRodent extends SPet{
    public SRodent(String name){ super(name);}
    public SRodent(){ super();}
}

class SRat extends SRodent{
    public SRat(String name){ super(name);}
    public SRat(){ super();}
}

class SMouse  extends SRodent {
    public SMouse(String name){ super(name);}
    public SMouse(){ super();}
}

class SHamster  extends SRodent {
    public SHamster(String name){ super(name);}
    public SHamster(){ super();}
}

class SCat extends SPet{
    public SCat(String name){ super(name);}
    public SCat(){ super(); }
}
class SManx  extends SCat {
    public SManx(String name){ super(name);}
    public SManx(){ super();}
}

class SEgyptianMau  extends SCat {
    public SEgyptianMau(String name){ super(name);}
    public SEgyptianMau(){ super();}
}

class SCymric extends SManx {
    public SCymric(String name){ super(name);}
    public SCymric(){ super();}
}
class Apply {
    public static <T, S extends Iterable<? extends T>>
    void apply(S seq, Method f, Object... args){
        for(T t : seq) {
            try {
                f.invoke(t, args);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
public class E40_SpeakingPets {
    public static void main(String args[]){
        List<SPet> pets = Arrays.asList(new SRat(), new SPug(),
                new SMutt(), new SMouse(), new SManx(),
                new SHamster(), new SEgyptianMau(),new SCymric());
        try {
            Apply.apply(pets, SPet.class.getMethod("speak"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}   /*  Output:
SRat  speak
SPug  speak
SMutt  speak
SMouse  speak
SManx  speak
SHamster  speak
SEgyptianMau  speak
SCymric  speak
 *///:~
