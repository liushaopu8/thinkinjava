/**********************************************
 * Verify that a new testObject is created before
 * each test
 **********************************************/
package com.shao.think.chapter20_annotations;

import org.junit.Test;

import java.util.*;

public class E04_TestSetupFixture {
    HashSet<String> testObject = new HashSet<>();
    @Test void _t1(){
        assert  testObject.isEmpty();
        testObject.add("one");
    }
    @Test
    void _t2(){
        assert testObject.isEmpty();
        testObject.add("one");
    }
    public static void main(String[] args){
        
    }
}
