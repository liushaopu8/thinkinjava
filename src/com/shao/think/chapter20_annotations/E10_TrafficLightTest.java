/**********************************************
 * Select an example from elsewhere in the book
 * and add @Unit tests
 **********************************************/
package com.shao.think.chapter20_annotations;


import com.shao.think.atunit.TestProperty;
import org.junit.Test;

enum Signal { GREEN, YELLOW, RED}

class TrafficLight{
    Signal color = Signal.RED;
    public void change() {
        switch (color){
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }
}

public class E10_TrafficLightTest {
    TrafficLight testObject = new TrafficLight();
    @Test void initialization(){
        assert testObject.toString().equals(str(Signal.RED));
    }

    @Test void _change(){
        testObject.change();
        assert testObject.toString().equals(str(Signal.GREEN));
        testObject.change();
        assert testObject.toString().equals(str(Signal.YELLOW));
        testObject.change();
        assert testObject.toString().equals(str(Signal.RED));
    }

    @TestProperty private static String str(Signal s){
        return "The traffic light is " + s;
    }
    public static void main(String[] args){

    }
}
