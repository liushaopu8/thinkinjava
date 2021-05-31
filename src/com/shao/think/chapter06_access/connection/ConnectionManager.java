package com.shao.think.chapter06_access.connection;

public class ConnectionManager {
    private static Connection[]  pool = new Connection[10];

    static {
        for (int i = 0; i < pool.length; i++) {
            pool[i] = new Connection();
        }
    }
    private static int counter = 0;
    public static Connection getConnection(){
        if(counter < pool.length){
            return pool[counter++];
        }
        return null;
    }

}
