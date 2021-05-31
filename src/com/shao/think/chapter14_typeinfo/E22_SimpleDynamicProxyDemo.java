//: chapter14_typeinfo/E22_SimpleDynamicProxyDemo.java
/***********************************************
 * Modify SimpleDynamicProxy.java so taht it measures
 * method-call times
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class DynamicProxyHandler implements InvocationHandler{

    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
        ", method: " + method + ", args: " + args);
        if(args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        long start = System.nanoTime();
        Object ret = method.invoke(proxied, args);
        long duration = System.nanoTime() - start;
        System.out.println("METHOD-CALL TIME: " + duration);
        return ret;
    }
}

public class E22_SimpleDynamicProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String [] args){
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class<?>[] {Interface.class},
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}   /*  Output:
 *///:~
