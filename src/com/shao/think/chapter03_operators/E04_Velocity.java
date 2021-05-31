package com.shao.think.chapter03_operators;

public class E04_Velocity {
    public static void main(String[] args){
        if(args.length < 2){
            System.err.println("Usage: java E04_Velocity distance timie");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[1]);
        float time = Float.parseFloat(args[2]);
        System.out.print("Velocity = ");
        System.out.print(distance/time);
        System.out.print(" m/s");
    }
}/* Output:

*///:~
