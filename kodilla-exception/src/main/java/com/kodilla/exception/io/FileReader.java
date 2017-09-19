package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names").getFile()); //odczytuje bez dopisku .txt


        try (Stream<String> fileLines = Files.lines(Paths.get("file/names"))){

            fileLines.forEach(System.out::println);
        }catch (IOException e) {

            throw new FileReaderException();


        }finally {
            System.out.println("I am gonna be here...always yeah!");
        }

    }
}
