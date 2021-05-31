//: chapter04_control/Fibonacci.java
/********************* Exercise 9 ********************
 * A Fibonacci sequence is the sequence of numbers 1;
 ****************************************************/

package com.shao.think.chapter04_control;

public class Fibonacci {
    static int fib(int n){
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
//        int n = Integer.parseInt(args[0]);
//        if(n < 0){
//            System.out.println("Cannot use negative numbers");
//            return;
//        }
        int n = 10;
        for(int i = 1; i <= n; i++) {
            System.out.print(fib(i) + ", ");
        }
    }
}/* Output:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55
*///:~
