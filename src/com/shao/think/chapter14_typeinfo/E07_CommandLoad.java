//: chapter14_typeinfo/E07_CommandLoad.java
/***********************************************
 * Modify SweetShip.java so that each tpe of object
 * creation is controlled by a command-line argument.
 * That is , if your command line is "java SweetShip
 * Candy," then only the Candy object is created.
 * Notice how you can control which Class objects are
 * loaded via the command-line argument
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

class Candy{
    static {Print.print("Loading Candy");}
}
class Gum{
    static {Print.print("Loading Gum");}
}
class Cookie{
    static {Print.print("Loading Cookie");}
}

public class E07_CommandLoad {
    public static void main(String [] args){
        for(String arg: args) {
            try {
                Class.forName(arg);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}   /*  Output:
 *///:~
