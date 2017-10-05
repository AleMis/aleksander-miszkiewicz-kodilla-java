package com.kodilla.spring.library;


import org.springframework.stereotype.Repository;

@Repository //zamiast adnotacji @Component użyliśmy adnotacji @Repository, co wskazuje na to, że nasza klasa
            // odpowiedzialna jest za obsługę składowania danych w trwałych zbiorach (repozytoriach),
            // takich jak na przykład bazy danych.
public final class LibraryDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database.");
    }

    //Klasa ta jest odpowiedzialna za zapisywanie stanu księgozbioru do bazy danych oraz odczytywanie tego stanu z bazy danych.
    // celu uproszczenia nie będzie nic w bazie danych zapisywała - po prostu wyświetli komunikat o tym, że dane są zapisywane lub odczytywane :)
}
