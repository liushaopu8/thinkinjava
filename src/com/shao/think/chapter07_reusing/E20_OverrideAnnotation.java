//: chapter07_reusing/E20_OverrideAnnotation.java
/****************** Exercise 20 ******************
 * Show taht the @Override annotation solves the
 * problem from the "final and private" section.
 ************************************************/
package com.shao.think.chapter07_reusing;

class WithFinals{
    WithFinals(int i){
        System.out.println("WithFinals()");
    }
    private final void f(){
        System.out.println("WithFinals.f()");
    }

    private void g(){
        System.out.println("WithFinals.g()");
    }
    public void h(){
        System.out.println("WithFinal.h()");
    }
}

class OverriingPrivateE20 extends WithFinals{
    OverriingPrivateE20(int i){
        super(i);
        System.out.println("OverriingPrivateE20()");
    }

//    @Override
//    private final void f(){
//        System.out.println("OverriingPrivateE20.f()");
//    }
//    @Override
//    private void g(){
//        System.out.println("OverriingPrivateE20.g()");
//    }
}

class OverridingPrivate2E20 extends OverriingPrivateE20{
    OverridingPrivate2E20(int i) {
        super(i);
        System.out.println("OverridingPrivate2E20()");
    }

//    @Override
//    public final void f(){
//        System.out.println("OverridingPrivate2E20.f()");
//    }
//    @Override
//    public void g(){
//        System.out.println("OverridingPrivate2E20.g()");
//    }
}

public class E20_OverrideAnnotation {
    public static void main(String[] args){
        OverridingPrivate2E20 op2 = new OverridingPrivate2E20(47);
        op2.h();
    }
}/* Output:
WithFinals()
OverriingPrivateE20()
OverridingPrivate2E20()
WithFinal.h()
*///:~
