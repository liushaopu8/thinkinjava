package com.shao.think.chapter06_access;

import com.shao.think.chapter06_access.local.AccessControl;

class WithProtected{
    protected int i;
}

public class ForeignClass {
    public static void main(String[] args){
//                PackagedClass.greeting();// protect
        AccessControl test = new AccessControl();
        test.a = 1;
        test.f1();
//        test.b = 2; //private
//        test.f2();
//        test.c = 3; //protect
//        test.f3();
//        test.d = 4; //package
//        test.f4();
        WithProtected wp = new WithProtected();
        wp.i = 47;
        System.out.println("wp.i = " + wp.i);
    }
}
