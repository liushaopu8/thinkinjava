//:chapter09_interfaces/E16_AdaptedCharSequence.java
/***************** Exercise 16 ********************
 * Create a class taht produces a sequence of chars.
 * Adapt this class so that it can be an input to a
 * Scanner object.
 **************************************************/
package com.shao.think.chapter09_interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharSequence{
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    char[] generate(){
        char[] buffer = new char[10];
        int index = 0;
        buffer[index++] = capitals[rand.nextInt(capitals.length)];
        for (int i = 0; i < 4; i++) {
            buffer[index++] = capitals[rand.nextInt(capitals.length)];
            buffer[index++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[index] = ' ';
        return buffer;
    }
}

public class E16_AdaptedCharSequence extends CharSequence implements Readable{
    private int count;
    public E16_AdaptedCharSequence(int count){
        this.count = count;
    }

    public int read(CharBuffer cb){
        if(count-- == 0){
            return -1;
        }
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(new E16_AdaptedCharSequence((10)));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}/* Output:
YNzBrNyGc
FOwZnTcQr
GSeGzMmJm
ROeSuEcUo
NEoEdLsMw
HLgEaHkCx
REqUcBbKi
NAmEsBtWh
KJuRuKzPg
WSqPzDyCy
*///:~
