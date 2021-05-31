//: chapter14_typeinfo/E24_RegisteredFactories3.java
/***********************************************
 * Add Null Objects to RegisteredFactories.java
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.chapter14_typeinfo.factory.Factory;
import com.shao.think.util.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface IPart{}

class Part3 implements IPart{
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    public static IPart newNUll(Class<? extends IPart> type){
        return (IPart)Proxy.newProxyInstance(IPart.class.getClassLoader(),
                new Class<?>[]{Null.class, IPart.class},
                new NullPartProxyHandler(type));
    }
    static List<Factory<IPart>> partFactories =
            new ArrayList<Factory<IPart>>();
    static{
        partFactories.add(new FuelFilter3.Factory());
        partFactories.add(new AirFilter3.Factory());
        partFactories.add(new CabinAirFilter3.Factory());
        partFactories.add(new OilFilter3.Factory());
        partFactories.add(new FanBelt3.Factory());
        partFactories.add(new PowerSteeringBelt3.Factory());
        partFactories.add(new GeneratorBelt3.Factory());
    }
    private static Random rand = new Random(47);
    public static IPart createRandom(){
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
class Filter3 extends Part3{}
class FuelFilter3 extends Filter3{
    public static class Factory
    implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){
            return new FuelFilter3();
        }
    }
}
class AirFilter3 extends Filter3{
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){
            return new AirFilter3();
        }
    }
}

class CabinAirFilter3 extends Filter3{
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){
            return new CabinAirFilter3();
        }
    }
}

class OilFilter3 extends Filter3{
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){
            return new OilFilter3();
        }
    }
}

class Belt3 extends Part3{}

class FanBelt3 extends Belt3{
    public static class Factory
    implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){ return new FanBelt3();}
    }
}

class GeneratorBelt3 extends Belt3{
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){ return new GeneratorBelt3();}
    }
}
class PowerSteeringBelt3 extends Belt3{
    public static class Factory
            implements com.shao.think.chapter14_typeinfo.factory.Factory<IPart>{
        public IPart create(){ return new PowerSteeringBelt3();}
    }
}

class NullPartProxyHandler implements InvocationHandler{
    private String nullName;
    private IPart proxied = new NPart();
    NullPartProxyHandler(Class<? extends IPart> type){
        nullName = type.getSimpleName() + ": [NUll Part]";
    }
    private class  NPart implements Null, IPart{
        public String toString(){
            return nullName;
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}

public class E24_RegisteredFactories3 {
    public static void main(String [] args){
        for (int i = 0; i < 10; i++) {
            IPart part = Part3.createRandom();
            System.out.println(part);
            System.out.println(Part3.newNUll(part.getClass()));
        }
    }
}   /*  Output:
GeneratorBelt3
GeneratorBelt3: [NUll Part]
CabinAirFilter3
CabinAirFilter3: [NUll Part]
GeneratorBelt3
GeneratorBelt3: [NUll Part]
AirFilter3
AirFilter3: [NUll Part]
PowerSteeringBelt3
PowerSteeringBelt3: [NUll Part]
CabinAirFilter3
CabinAirFilter3: [NUll Part]
FuelFilter3
FuelFilter3: [NUll Part]
PowerSteeringBelt3
PowerSteeringBelt3: [NUll Part]
PowerSteeringBelt3
PowerSteeringBelt3: [NUll Part]
FuelFilter3
FuelFilter3: [NUll Part]
 *///:~
