package com.kodilla.spring.library;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class LibraryTestSuite {

    @Test
    public void testLoadFromDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);

        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When & Then
        System.out.println("====== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<< ==== Beans list ====");
    }
    //W teście tym tworzymy kontekst aplikacji w oparciu o LibraryConfig.class, czyli mówimy Springowi, że tworząc
    // kontekst ma się odwołać tylko do klasy konfigurującej LibraryConfig. Następnie wyświetlamy wszystkie Beany,
    // które zostały załadowane do Kontenera
}
