package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {

    private HashMap<String, Boolean> airports;

    public SearchFlights(HashMap<String, Boolean> airports) {
        this.airports = airports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException{

        if (airports.containsKey(flight.getArrivalAirport())) {
            for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    System.out.println("Airport: " + flight.getArrivalAirport() + " ; " + "possibility of flight: " + entry.getValue());
                }
            }
        }else {
            throw new RouteNotFoundException("Airport not found!");
        }
    }


}
