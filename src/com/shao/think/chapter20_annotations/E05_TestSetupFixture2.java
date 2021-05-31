/**********************************************
 * Modify the above example to use the inheritance
 * approach.
 **********************************************/
package com.shao.think.chapter20_annotations;

import org.junit.Test;

import java.util.HashSet;

public class E05_TestSetupFixture2 extends HashSet<String> {

    @Test void _t1(){
        assert isEmpty();
        add("one");
    }

    @Test void _t2(){
        assert isEmpty();
        add("one");
    }

    public static void main(String[] args){

    }
}
