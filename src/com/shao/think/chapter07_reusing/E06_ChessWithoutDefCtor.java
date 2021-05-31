//: chapter07_reusing/E06_ChessWithoutDefCtor.java
/****************** Exercise 2 *******************
 * If you don't call the base-class constructor in
 * BoardGame(), the compiler will respond taht it
 * can't find a constructor of the form Game(). The
 * call to the base-class constructor must be the
 * thing you do in the derived-class constructor.
 * (The compiler will remind you if you get it wrong)
 * Use Chess.java toprove those assertions.
 ************************************************/
package com.shao.think.chapter07_reusing;

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

class ChessWithoutDeftor extends BoardGame{
    ChessWithoutDeftor(int i) {
        super(i);
        System.out.println("ChessWithoutDefCtor  constructor");
    }
}

public class E06_ChessWithoutDefCtor {
    public static void main(String [] args){
        new ChessWithoutDeftor(11);
    }
}///:~
