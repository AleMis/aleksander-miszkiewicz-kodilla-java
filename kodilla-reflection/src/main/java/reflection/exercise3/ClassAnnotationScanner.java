package reflection.exercise3;

import org.reflections.Reflections;
import org.reflections.scanners.*;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Method;
import java.util.Set;

public class ClassAnnotationScanner {

    static Reflections reflections = new Reflections(new ConfigurationBuilder()
            .setUrls(ClasspathHelper.forPackage("reflection.exercise3"))
            .setScanners(new TypeAnnotationsScanner(),
                         new SubTypesScanner(),
                         new MethodAnnotationsScanner()));

    public static void printClassWhichUsesDatabaseAnnotation() {
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MainClassAnnotation.class);
        annotated.stream().forEach(System.out::println);
    }

    public static void printMethodsWhichUsesAddObjectAnnotation() {
        Set<Method> annotated = reflections.getMethodsAnnotatedWith(AddObjectAnnotation.class);
        annotated.stream().forEach(System.out::println);
    }

    public static void printMethodsWhichUsesPrintObjectListAnnotation() {
        Set<Method> annotated = reflections.getMethodsAnnotatedWith(PrintObjectListsAnnotation.class);
        annotated.stream().forEach(System.out::println);
    }
}
