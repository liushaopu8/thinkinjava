//: chapter07_reusing/E19_BlankFinalField.java
/****************** Exercise 19 *******************
 * Create a class with a blank final reference to
 * an object. Perfrom initialization of the blank
 * final inside all constructors. Demonstrate that
 * the final must be initialized before use, and
 * cannot be changed once initialized.
 ************************************************/
package com.shao.think.chapter07_reusing;

class WithBlankFinalField{
    private final Integer i;
    public WithBlankFinalField(int ii){
        i = new Integer(ii);
    }

    public Integer geti(){
        /*
              this won't compile. The error is:
              cannot assign a value
        * */
//        if(i == null) i = new Integer(47);
        return i;
    }
}


public class E19_BlankFinalField {
    public static void main(String args[]){
        WithBlankFinalField wbff = new WithBlankFinalField(10);
        System.out.println(wbff.geti());
    }
}/* Output:
10
*///:~
