//:chapter03_operators/E06_DogsComparison.java
/*********************** Exercise 6 *******************
 * Following Exercise 5 assign, a new Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all references
 ******************************************************/
package com.shao.think.chapter03_operators;

public class E06_DogsComparison {
    static void compare(Dog dog1, Dog dog2){
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println("equals() on top references: " + (dog1 == dog2));
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println( "equals() on names: " + (dog1.name.equals(dog2.name)));
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println( "equals() on says: " + (dog1.says.equals(dog2.says)));
    }

    public static void main(String[] args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;
        dog1.name = "spot"; dog1.says = "ruff!";
        dog2.name = "scruff"; dog2.says = "wurf!";
        System.out.println("comparing dog1 and dog2 object");
        compare(dog1, dog2);
        System.out.println("comparing dog1 and dog3 object");
        compare(dog1, dog3);
        System.out.println("comparing dog2 and dog3 object");
        compare(dog2, dog3);
    }
} /* Output:
comparing dog1 and dog2 object
== on top references: false
equals() on top references: false
== on names: false
equals() on names: false
== on says: false
equals() on says: false
comparing dog1 and dog3 object
== on top references: true
equals() on top references: true
== on names: true
equals() on names: true
== on says: true
equals() on says: true
comparing dog2 and dog3 object
== on top references: false
equals() on top references: false
== on names: false
equals() on names: false
== on says: false
equals() on says: false
*///: ~
