//: annotation: E01_TableCreator
//{args: annotations.Member
/**********************************************
 * Implement more SQL types in the database example.
 **********************************************/
package com.shao.think.chapter20_annotations;

import com.shao.think.chapter20_annotations.database.*;
import com.shao.think.util.Print;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


@DBTable(name = "MEMBER")
class Member{
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLCharacter(value = 15, constraints = @Constraints(primaryKey = true)) String handle;
    static int memeberCount;
    @SQLBoolean Boolean isVIP;
    public String getHandle(){ return handle;}
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public String toString(){return handle;}
    public Integer getAge(){return age;}
    public Boolean isVIP(){ return isVIP; }
}

public class E01_TableCreator {
    public static void main(String[] args) throws ClassNotFoundException {
//        if(args.length < 1){
//            Print.print("arguments: annotated classes");
//            System.exit(0);
//        }
//        for(String className: args)
        {
            String className = "com.shao.think.chapter20_annotations.Member";
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if(dbTable == null){
                Print.print("No DBTable annotations in class " + className);
//                continue;
            }
            String tableName = dbTable.name();
            //if the name is empty, use the Class name:
            if(tableName.length() < 1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<>();
            for(Field field : cl.getDeclaredFields()){
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if(anns.length < 1) continue;
                if(anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger)anns[0];
                    //use field name if name not specified
                    if(sInt.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sInt.name();
                    columnDefs.add(columnName + "INT" + getConstrains(sInt.constraints()));
                }else if(anns[0] instanceof SQLString){
                    SQLString sString = (SQLString) anns[0];
                    //use field name if name not specified
                    if(sString.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sString.name();
                    columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" + getConstrains(sString.constraints()));
                }else if(anns[0] instanceof SQLBoolean){
                    SQLBoolean sBol = (SQLBoolean)anns[0];
                    if(sBol.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sBol.name();
                    columnDefs.add(columnName + " BOOLEAN" + getConstrains(sBol.constraints()));
                }else if(anns[0] instanceof SQLCharacter){
                    SQLCharacter sChar = (SQLCharacter) anns[0];
                    if(sChar.name().length() < 1)
                        columnName = field.getName().toUpperCase();
                    else
                        columnName = sChar.name();
                    columnDefs.add(columnName + " CHARACTER(" + sChar.value() + ")" + getConstrains(sChar.constraints()));
                }
                StringBuilder createCommand = new StringBuilder("CREATE TABLE " +  tableName + "(");
                for(String columnDef : columnDefs)
                    createCommand.append("\n    " + columnDef + ",");
                String tableCreate = createCommand.substring(0, createCommand.length() -1) + ");";
                System.out.print("Table creation SQL for " + className + "  is : \n" + tableCreate);
            }
        }
    }

    private static String getConstrains(Constraints con){
        String constraints = "";
        if(!con.allowNull())
            constraints += " NOT NULL";
        if(con.primaryKey())
            constraints += " PRIMARY KEY";
        if(con.unique())
            constraints += " UNIQUE";
        return constraints;
    }
}
