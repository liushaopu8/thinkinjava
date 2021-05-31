/**********************************************
 * Use the inheritance approach to modify Exercise 6
 **********************************************/
package com.shao.think.chapter20_annotations;

import org.junit.Test;

import java.util.LinkedList;

public class E07_LinkedListTest2 extends LinkedList<String> {
    @Test
    void _initialization(){
        assert isEmpty();
    }

    @Test void _contains(){
        add("one");
        assert contains("one");
    }

    @Test void _remove(){
        add("one");
        remove("one");
        assert isEmpty();
    }
    public static void main(String[] args){

    }
}
