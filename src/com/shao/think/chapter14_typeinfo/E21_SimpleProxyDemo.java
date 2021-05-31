//: chapter14_typeinfo/E21_SimpleProxyDemo.java
/***********************************************
 * Modify SimpleProxyDemo.java so it measures
 * method-call times
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{

    @Override
    public void doSomething() {
        Print.print("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        Print.print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        Print.print("SimpleProxy doSomething");
        long start = System.nanoTime();
        proxied.doSomething();
        long duration = System.nanoTime() - start;
        Print.print("METHOD-CALL TIME: " + duration);
    }

    @Override
    public void somethingElse(String arg) {
        Print.print("SimpleProxy soemthingElse " + arg);
        long start = System.nanoTime();
        proxied.somethingElse(arg);
        long duration = System.nanoTime() - start;
        Print.print("METHOD-CALL TIME: " + duration);
    }
}
public class E21_SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
    public static void main(String [] args){
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}   /*  Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
METHOD-CALL TIME: 79171
SimpleProxy soemthingElse bonobo
somethingElse bonobo
METHOD-CALL TIME: 74773

 *///:~
