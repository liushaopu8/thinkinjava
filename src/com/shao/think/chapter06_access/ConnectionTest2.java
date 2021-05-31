package com.shao.think.chapter06_access;

import com.shao.think.chapter06_access.connection2.Connection;
import com.shao.think.chapter06_access.connection2.ConnectionManager;

public class ConnectionTest2 {
    public static void main(String[] args){
        Connection[] ca = new Connection[10];
        for (int i = 0; i < 10; i++) {
            ca[i] = ConnectionManager.getConnection();
        }
        System.out.println(ConnectionManager.getConnection());
        for (int i = 0; i < 5; i++) {
            ca[i].checkIn();
            Connection c = ConnectionManager.getConnection();
            c.doSomething();
            c.checkIn();//always connection 0
        }

        for (int i = 0; i < 10; i++) {
            ca[i] = ConnectionManager.getConnection();
            System.out.println(ca[i]);
            if(ca[i] == null) break;
        }
    }
}
