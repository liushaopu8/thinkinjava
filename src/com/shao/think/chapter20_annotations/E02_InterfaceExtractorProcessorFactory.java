//:chapter20_annotations/E02_InterfaceExtractorProcessorFactory
// APT-based annotation processing
/**********************************************
 * Add Support for division to the interface
 * extractor.
 **********************************************/
package com.shao.think.chapter20_annotations;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface ExtractInterface {
    public String value();
}

class Divisor{
    public int divide(int x, int y){
        int total = 0;
        while(x >= y){
            x = sub(x,y);
            total++;
        }
        return total;
    }
    private int sub(int x, int y) {
        return x - y;
    }
}

class InterfaceExtractorProcessor implements AnnotationProcessor {

    private final AnnotationProcessorEnvironment env;
    private ArrayList<MethodDeclaration> interfaceMethods =
            new ArrayList<>();

    InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
        this.env = env;
    }

    @Override
    public void process() {
        for(TypeDeclaration typeDecl :
                env.getSpecifiedTypeDeclarations()){
            ExtractInterface annot = typeDecl.getAnnotation(ExtractInterface.class);
            if( annot == null) break;
            for(MethodDeclaration m : typeDecl.getMethods())
                if(m.getModifiers().contains(Modifier.PUBLIC) &&
                        !(m.getModifiers().contains(Modifier.STATIC)))
                    interfaceMethods.add(m);
            if(interfaceMethods.size() > 0){
                try {
                    PrintWriter writer = env.getFiler().createSourceFile(annot.value());
                    writer.println("package " +
                    typeDecl.getPackage().getQualifiedName() + ";");
                    writer.println("public interface " + annot.value() + "{" );
                    for(MethodDeclaration m : interfaceMethods){
                        writer.print("  public ");
                        writer.print(m.getReturnType() + " ");
                        writer.print(m.getSimpleName() + " (");
                        int i = 0;
                        for(ParameterDeclaration parm :
                                m.getParameters()){
                            writer.print(parm.getType() + " " + m.getSimpleName());
                            if(++i < m.getParameters().size())
                                writer.print(", ");
                        }
                        writer.println(");");
                    }
                    writer.println("}");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

public class E02_InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
    @Override
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }

    @Override
    public Collection<String> supportedAnnotationTypes() {
        return Collections.singleton("com.shao.think.chapter20_annotations.ExtractInterface");
    }

    @Override
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set,
                                               AnnotationProcessorEnvironment annotationProcessorEnvironment) {
        return new InterfaceExtractorProcessor(annotationProcessorEnvironment);
    }
}
