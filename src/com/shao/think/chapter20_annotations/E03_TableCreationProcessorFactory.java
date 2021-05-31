/**********************************************
 * Add support for more SQL types to
 * TableCreationProcessorFactory.java
 **********************************************/
package com.shao.think.chapter20_annotations;

import com.shao.think.chapter20_annotations.database.*;
import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;
import com.sun.mirror.declaration.ClassDeclaration;
import com.sun.mirror.declaration.FieldDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.util.SimpleDeclarationVisitor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import static com.sun.mirror.util.DeclarationVisitors.NO_OP;
import static com.sun.mirror.util.DeclarationVisitors.getDeclarationScanner;

public class E03_TableCreationProcessorFactory implements AnnotationProcessorFactory {
    public static void main(String[] args){

    }

    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Arrays.asList(
                "com.shao.think.chapter20_annotations.database.DBTable",
                "com.shao.think.chapter20_annotations.database.Constraints",
                "com.shao.think.chapter20_annotations.database.SQLString",
                "com.shao.think.chapter20_annotations.database.SQLInteger",
                "com.shao.think.chapter20_annotations.database.SQLBoolean",
                "com.shao.think.chapter20_annotations.database.SQLCharacter"
        );
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment annotationProcessorEnvironment) {
        return new TableCreationProcessor(annotationProcessorEnvironment);
    }

    private static class TableCreationProcessor implements AnnotationProcessor {

        private final AnnotationProcessorEnvironment env;
        private String sql = "";

        public TableCreationProcessor(AnnotationProcessorEnvironment env) {
            this.env = env;
        }

        @Override
        public void process() {
            for(TypeDeclaration typeDecl :
                    env.getSpecifiedTypeDeclarations()){
                typeDecl.accept(getDeclarationScanner(
                        new TableCreationVisitor(), NO_OP));
                sql = sql.substring(0, sql.length() - 1) + ");";
                System.out.println("creation SQL is :\n" + sql);
                sql = "";
            }
        }


        private class TableCreationVisitor extends SimpleDeclarationVisitor{
            @Override
            public void visitClassDeclaration(ClassDeclaration d) {
                DBTable dbTable = d.getAnnotation(DBTable.class);
                if(dbTable != null){
                    sql += "CREATE TABLE";
                    sql += (dbTable.name().length() < 1)
                            ? d.getSimpleName().toUpperCase()
                            : dbTable.name();
                    sql += " (";
                }
            }

            public void visitFieldDeclaration(FieldDeclaration d){
                String columnName = "";
                if(d.getAnnotation(SQLInteger.class) != null){
                    SQLInteger sInt = d.getAnnotation(SQLInteger.class);
                    if(sInt.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sInt.name();
                    sql += "\n      " + columnName + "  INT" +
                            getConstraints(sInt.constraints()) + ",";
                }
                if(d.getAnnotation(SQLString.class) != null){
                    SQLString sString = d.getAnnotation(SQLString.class);
                    if(sString.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sString.name();
                    sql += "\n      " + columnName + "  VARCHAR" +
                            getConstraints(sString.constraints()) + ",";
                }
                if(d.getAnnotation(SQLBoolean.class) != null){
                    SQLBoolean sBol = d.getAnnotation(SQLBoolean.class);
                    if(sBol.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sBol.name();
                    sql += "\n      " + columnName + "  BOOLEAN" +
                            getConstraints(sBol.constraints()) + ",";
                }
                if(d.getAnnotation(SQLCharacter.class) != null){
                    SQLCharacter sChar = d.getAnnotation(SQLCharacter.class);
                    if(sChar.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sChar.name();
                    sql += "\n      " + columnName + "  CHARACTER" +
                            getConstraints(sChar.constraints()) + ",";
                }
            }

            private String getConstraints(Constraints con) {
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
    }


}
