//: chapter15_generics/.java
/*************** Exercise 22 *******************
 * Use a type tag along with reflection to create
 * a method that uses the argument version of
 * newInstance() to create an object of a class
 * with a constructor that has arguments.
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.util.Print;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Emplyee{}

class ClassAsFactory<T>{
    Class<T> kind;
    public ClassAsFactory(Class<T> kind){ this.kind = kind;}
    public T create(int arg) {
        for(Constructor<?> ctor : kind.getConstructors()) {
            Class<?>[] params = ctor.getParameterTypes();
            if(params.length == 1)
                if(params[0] == int.class) {
                    try {
                        return kind.cast(ctor.newInstance(arg));
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
        }
        return null;
    }
}

public class E22_InstantiateGenericType2 {
    public static void main(String args[]){
        ClassAsFactory<Emplyee> fe = new ClassAsFactory(Emplyee.class);
        Emplyee emp = fe.create(1);
        if(emp == null)
            Print.print("Employee cannot be instantiated!");
        ClassAsFactory<Integer> fi =
                new ClassAsFactory<>(Integer.class);
        final Integer i = fi.create(0);
        if(i == null)
            Print.print("Integer cannot be instantiated!");
    }
}   /*  Output:
 *///:~
