/**********************************************
 * Test LinkedList using the approach shown in
 * HashSetTest.java
 **********************************************/
package com.shao.think.chapter20_annotations;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.LinkedList;

public class E06_LinkedListTest {
    LinkedList<String> testObject = new LinkedList<>();

    @Test void _initialization(){
        assert testObject.isEmpty();
    }

    @Test void _contains(){
        testObject.add("one");
        assert testObject.contains("one");
    }

    @Test void _remove(){
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }

    public static void main(String[] args){

    }
}
