//: chapter06_access/ConnectionTest.java
/******************** Exercise 8 *******************
 * Following the form of the example Lunch.java,
 * create a class called ConnectionManager that
 * manages a fixed array of Connection objects.
 * The client programmer must not be able to create
 * connection objects,but only get them via a static
 * method in ConnectionManager. ConnectoinManager
 * returns a null reference when it runs out of objects.
 * Test the classes in main()
 ***************************************************/
package com.shao.think.chapter06_access;

import com.shao.think.chapter06_access.connection.Connection;
import com.shao.think.chapter06_access.connection.ConnectionManager;

public class ConnectionTest {
    public static void main(String[] args){
        Connection c = ConnectionManager.getConnection();
        while(c != null){
            System.out.println(c);
            c.doSomething();
            c = ConnectionManager.getConnection();
        }
    }
}   /* Output:
Connection 0
Connection 1
Connection 2
Connection 3
Connection 4
Connection 5
Connection 6
Connection 7
Connection 8
Connection 9
*///~
