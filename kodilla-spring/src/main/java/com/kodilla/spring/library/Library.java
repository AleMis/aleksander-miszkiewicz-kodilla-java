package com.kodilla.spring.library;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//@Service, oznacza, klasa ta jest złożonym komponentem, realizującym różne usługi biznesowe (tak naprawdę możemy
        // napisać po prostu @Component i rozwiązanie również będzie działało).
public final class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;


    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }


    public Library() {
        //do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
