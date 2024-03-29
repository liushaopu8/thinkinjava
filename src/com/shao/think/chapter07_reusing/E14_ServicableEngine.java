//: chapter07_reusing/E14_ServicableEngine.java
/****************** Exercise 14 *******************
 * In Car.java add a service() method to Engine
 * and call this method in main().
 ************************************************/
package com.shao.think.chapter07_reusing;

class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
}

class Wheel{
    public void inflate(int psi){}
}

class Window{
    public void rollup(){}
    public void rolldown(){}
}

class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}

class ServicableEngine extends Engine{
    public void service(){}
}
class ServicableCar{
    public ServicableEngine engine = new ServicableEngine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door();
    public ServicableCar(){
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }
}

public class E14_ServicableEngine {
    public static void main(String[] args){
        ServicableCar car = new ServicableCar();
        car.left.window.rolldown();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
