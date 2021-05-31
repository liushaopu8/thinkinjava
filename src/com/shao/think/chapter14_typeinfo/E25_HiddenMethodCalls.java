//: chapter14_typeinfo/E25_HiddenMethodCalls.java
/***********************************************
 * Create a class containing private, protected and
 * package access methods. Write code to access these
 * methods from outside of the class's package
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.chapter14_typeinfo.classa.A;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class E25_HiddenMethodCalls {
    static void callHiddenMethod(Object a, String methodName){
        Method g = null;
        try {
            g = a.getClass().getDeclaredMethod(methodName);
            g.setAccessible(true);
            g.invoke(a);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        class B extends A {
            protected void b(){super.b();}
        }
        A objA = new A();
        /**
         * Compile time error
         *         objA.a();
         *         objA.b();
         *         objA.c();
         */
        callHiddenMethod(objA,"a");
        callHiddenMethod(objA,"b");
        callHiddenMethod(objA,"c");
        B objB = new B();
        objB.b();
    }
}   /*  Output:
A.a()
A.b()
A.c()
A.b()
 *///:~
