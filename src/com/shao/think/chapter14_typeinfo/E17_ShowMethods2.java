//: chapter14_typeinfo/E17_ShowMethods2.java
/***********************************************
 * Modify the regular expression in ShowMethods.java
 * to also strip off the keywords native and final.
 * (Hint: Use the OR operator '|'.)
 ***********************************************/
package com.shao.think.chapter14_typeinfo;

import com.shao.think.util.Print;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class E17_ShowMethods2 {
    private static String usage =
            "usage:\n" +
                    "E17_ShowMethods2 qualified.class.name\n" +
                    "To show all methods in class or:\n" +
                    "E17_ShowMethods2 qualified.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p =
            Pattern.compile("\\w+\\.|native\\s|final\\s");
    public static void main(String [] args){
        if(args.length < 1){
            Print.print(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] ctors = c.getConstructors();
            if(args.length == 1){
                for(Method method : methods)
                    Print.print(p.matcher(method.toString()).replaceAll(""));
                for(Constructor<?> ctor : ctors)
                    Print.print(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            }else {
                for(Method method : methods)
                    if(method.toString().indexOf(args[1]) != -1){
                        Print.print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor<?> ctor : ctors){
                    if(ctor.toString().indexOf(args[1]) != -1){
                        Print.print(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            Print.print("No such class: " + e);
        }
    }
}   /*  Output:
 *///:~
