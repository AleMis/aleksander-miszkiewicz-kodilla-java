package com.kodilla.exception.test;

import java.util.HashMap;

public class MainFlights {

    public static void main(String args[]) {

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Okęcie", true);
        airports.put("Pyrzowice", true);
        airports.put("Wrocław", false);

        SearchFlights search = new SearchFlights(airports);
        Flight myFirstFlight = new Flight("Ateny", "Okęcie");
        Flight mySecongFlight = new Flight("Pyrzowice", "Berlin");

        //first Flight
        try {
            search.findFlight(myFirstFlight);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //second Flight
        try {
            search.findFlight(mySecongFlight);
        }catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
