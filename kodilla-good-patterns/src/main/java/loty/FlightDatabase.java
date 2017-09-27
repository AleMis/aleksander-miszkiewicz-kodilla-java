package loty;

import java.util.HashSet;

public class FlightDatabase {

    private static HashSet<Flight> flighDatabase = new HashSet<>();

    public static HashSet<Flight> getFlighDatabase() {
        Flight wrowwa = new Flight("Wrocław", "Warszawa");
        Flight wrogdn = new Flight("Wrocław", "Gdańsk");
        Flight wrokrk = new Flight("Wrocłąw", "Kraków");
        Flight wwakrk = new Flight("Warszawa", "Kraków");
        Flight wwaber = new Flight("Warszawa", "Berlin");
        Flight krkgdn = new Flight("Kraków", "Gdańsk");
        Flight berpar = new Flight("Berlin", "Paryż");
        Flight krkber = new Flight("Kraków", "Berlin");
        Flight gdnwwa = new Flight("Gdańsk", "Warszawa");

        flighDatabase.add(wrowwa);
        flighDatabase.add(wrogdn);
        flighDatabase.add(wrokrk);
        flighDatabase.add(wwakrk);
        flighDatabase.add(wwaber);
        flighDatabase.add(krkgdn);
        flighDatabase.add(berpar);
        flighDatabase.add(krkber);
        flighDatabase.add(gdnwwa);

        return flighDatabase;
    }
}
