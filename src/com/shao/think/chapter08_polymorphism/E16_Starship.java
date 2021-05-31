//:chapter08_polymorphism/E16_Starship.java
/*************  Exercise 16 ******************
 * Following the example in Transmogrify.java,
 * create a Starship class containing an AlertStatus
 * reference that can indicate three different status.
 * Include methods to change the status.
 ********************************************/
package com.shao.think.chapter08_polymorphism;

class AlertStatus{
    public String getStatus(){
        return "None";
    }
}

class YellowAlertStatus extends AlertStatus{
    public String getStatus(){
        return "Yellow";
    }
}
class RedAlertStatus extends AlertStatus{
    public String getStatus(){
        return "Red";
    }
}

class GreenAlertStatus extends AlertStatus{
    public String getStatus(){
        return "Green";
    }
}
class Starship {
    private AlertStatus status = new GreenAlertStatus();
    public void setStatus(AlertStatus alertStatus) {
        status = alertStatus;
    }
    public String toString(){
        return status.getStatus();
    }
}
public class E16_Starship {
    public static void main(String [] args){
        Starship eprise = new Starship();
        System.out.print(eprise);
        eprise.setStatus(new YellowAlertStatus());
        System.out.print(eprise);
        eprise.setStatus(new RedAlertStatus());
        System.out.print(eprise);
    }
}   /* Output:
Green
Yellow
Red
*///:~
