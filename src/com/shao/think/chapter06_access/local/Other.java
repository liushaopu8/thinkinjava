package com.shao.think.chapter06_access.local;

public class Other {
    public Other(){
        AccessControl test = new AccessControl();
        test.a = 1;
//        test.b = 2;// 'b' has private access
        test.c = 3;
        test.d = 4;
        test.f1();
//        test.f2();// f2() has privae access
        test.f3();
        test.f4();
    }
}
