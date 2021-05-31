//: chapter14_typeinfo/E09_GetDeclaredFields.java
/***********************************************
 * Modify the previous exercise so that it uses
 * Class.getDeclaredFields() to also display
 * information about the fields in a class
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

interface Iface{
    int i = 47;
    void f();
}

class Base implements Iface{
    String s;
    double d;
    @Override
    public void f() {
        Print.print("Base.f");
    }
}

class Composed{
    Base b;
}

class Derived extends Base{
    Composed c;
    String s;
}

public class E09_GetDeclaredFields {
    public static void main(String [] args){

            try {
                printClass(Derived.class);
                for(int i = 0; i < args.length; i++){
                    Print.print("Displaying " + args[i]);
                    printClass(Class.forName(args[i]));
                    if(i < args.length - 1)
                        System.out.println("========================");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
    static Set<Class<?>> alreadyDisplayed = new HashSet<>();
    static void printClass(Class<?> c) {
        if(c == null) return;
        Print.print(c.getName());
        Field[] fields = c.getDeclaredFields();
        if(fields.length != 0)
            Print.print("Fields: ");
        for (Field fld : fields) {
            Print.print("   " + fld);
        }

        for (Field fld : fields) {
            Class<?> k = fld.getType();
            if (!alreadyDisplayed.contains(k)){
                printClass(k);
                alreadyDisplayed.add(k);
            }
        }
        for(Class<?> k : c.getInterfaces()){
            Print.print("Interfaces: " + k.getName());
            printClass(k.getSuperclass());
        }
        printClass(c.getSuperclass());
    }
}   /*  Output:
com.shao.think.chapter14_typeinfo.Derived
Fields:
   com.shao.think.chapter14_typeinfo.Composed com.shao.think.chapter14_typeinfo.Derived.c
   java.lang.String com.shao.think.chapter14_typeinfo.Derived.s
com.shao.think.chapter14_typeinfo.Composed
Fields:
   com.shao.think.chapter14_typeinfo.Base com.shao.think.chapter14_typeinfo.Composed.b
com.shao.think.chapter14_typeinfo.Base
Fields:
   java.lang.String com.shao.think.chapter14_typeinfo.Base.s
   double com.shao.think.chapter14_typeinfo.Base.d
java.lang.String
Fields:
   private final char[] java.lang.String.value
   private int java.lang.String.hash
   private static final long java.lang.String.serialVersionUID
   private static final java.io.ObjectStreamField[] java.lang.String.serialPersistentFields
   public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER
[C
Interfaces: java.lang.Cloneable
Interfaces: java.io.Serializable
java.lang.Object
int
long
[Ljava.io.ObjectStreamField;
Interfaces: java.lang.Cloneable
Interfaces: java.io.Serializable
java.lang.Object
java.util.Comparator
Interfaces: java.io.Serializable
Interfaces: java.lang.Comparable
Interfaces: java.lang.CharSequence
java.lang.Object
double
Interfaces: com.shao.think.chapter14_typeinfo.Iface
java.lang.Object
java.lang.Object
com.shao.think.chapter14_typeinfo.Base
Fields:
   java.lang.String com.shao.think.chapter14_typeinfo.Base.s
   double com.shao.think.chapter14_typeinfo.Base.d
Interfaces: com.shao.think.chapter14_typeinfo.Iface
java.lang.Object
 *///:~
