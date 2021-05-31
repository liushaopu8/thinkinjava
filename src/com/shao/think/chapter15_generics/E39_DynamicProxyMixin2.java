//: chapter15_generics/.java
/*************** Exercise 39 *******************
* Add a new mixin class Colored to
 * DynamicProxyMixin.java, mix it in to mixin, and
 * show that it works
 **********************************************/
package com.shao.think.chapter15_generics;

import com.shao.think.chapter15_generics.tuple.TwoTuple;
import com.shao.think.util.Print;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import static com.shao.think.chapter15_generics.tuple.Tuple.tuple;

class MixinProxy implements InvocationHandler {
    Map<String,Object> delegatesByMethod;
    public MixinProxy(TwoTuple<Object,Class<?>>... pairs){
        delegatesByMethod = new HashMap<String, Object>();
        for(TwoTuple<Object, Class<?>> pair : pairs){
            for(Method method : pair.second.getMethods()){
                String methodName = method.getName();
                if(!delegatesByMethod.containsKey(methodName))
                    delegatesByMethod.put(methodName, pair.first);
            }
        }
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate,args);
    }

    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = (Class) pairs[i].second;
        }
        ClassLoader cl = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
}

public class E39_DynamicProxyMixin2 {
    public static void main(String args[]){
        Object mixin = MixinProxy.newInstance(
                tuple(new BasicImp(), Basic.class),
                tuple(new TimeStampedImp(), TimeStamped.class),
                tuple(new SerialNumberedImp(), SerialNumbered.class),
                tuple(new ColoredImp(), Colored.class));
        Basic b = (Basic)mixin;
        TimeStamped t = (TimeStamped)mixin;
        SerialNumbered s = (SerialNumbered)mixin;
        Colored c = (Colored)mixin;
        b.set("Hello");
        Print.print(b.get());
        Print.print(t.getStamp());
        Print.print(s.getSerialNumber());
        Print.print(c.getColor());
    }
}   /*  Output:
 *///:~
