//: chapter04_control/BitwiseOperators2.java
/******************  Exercise 05  ****************
 * Repeat Exercise 10 from the previous chapter,
 * but use the ternary operator and a bitwise test
 * instead of Integer.toBinaryString() to display
 * the ones and zeroes
 ************************************************/
package com.shao.think.chapter04_control;

public class BitwiseOperators2 {
    private static void toBinaryString(int i){
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = (0 != (i & 0x01)) ? '1' : '0';
            i >>>= 1;
        }while(i != 0);
        for(int j = bufferPosition; j < 32; j++)
            System.out.print(buffer[j]);
        System.out.println();
    }

    public static void main(String[] args){
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.print("i1 = "); toBinaryString(i1);
        System.out.print("~i1 = "); toBinaryString(~i1);
        System.out.print("~i1 & i1 =  "); toBinaryString(i1 & i1);
        System.out.print("~i1 | i1 =  "); toBinaryString(i1 | i1);
        System.out.print("~i1 ^ i1 =  "); toBinaryString(i1 ^ i1);

        System.out.print("i2 = "); toBinaryString(i2);
        System.out.print("~i2 = "); toBinaryString(~i2);
        System.out.print("~i1 & i2 =  "); toBinaryString(i1 & i2);
        System.out.print("~i1 | i2 =  "); toBinaryString(i1 | i2);
        System.out.print("~i1 ^ i2 =  "); toBinaryString(i1 ^ i2);
    }
} /* Output:
i1 = 10101010101010101010101010101010
~i1 = 1010101010101010101010101010101
~i1 & i1 =  10101010101010101010101010101010
~i1 | i1 =  10101010101010101010101010101010
~i1 ^ i1 =  0
i2 = 1010101010101010101010101010101
~i2 = 10101010101010101010101010101010
~i1 & i2 =  0
~i1 | i2 =  11111111111111111111111111111111
~i1 ^ i2 =  11111111111111111111111111111111
*///:~
