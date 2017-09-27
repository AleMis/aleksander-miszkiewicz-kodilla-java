package loty;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlights {

    public void searchFlightsFromCity(String city) {
        List<Flight> departureAirports = FlightDatabase.getFlighDatabase().stream()
                .filter(departure -> departure.getDepartueAirport().equals(city))
                .collect(Collectors.toList());

        if (departureAirports.equals(null)) {
            System.out.println("No results found!");
        } else {
            System.out.println("Flights from: " + city);
            departureAirports.forEach(System.out::println);
        }
    }

    public void searchFlightsToCity(String city) {
        List<Flight> arrivalAirports = FlightDatabase.getFlighDatabase().stream()
                .filter(arrival -> arrival.getArrivalAirport().equals(city))
                .collect(Collectors.toList());
        if (arrivalAirports.equals(null)) {
            System.out.println("No results found!");
        } else {
            System.out.println("Flights to: " + city);
            arrivalAirports.forEach(System.out::println);
        }
    }

    public void searchFlightViaCityToCity(String departureAirport, String placeOfChange, String arrivalAirport ) {
        List<Flight> firstFlight = FlightDatabase.getFlighDatabase().stream()
                .filter(departure -> departure.getDepartueAirport().equals(departureAirport))
                .filter(change -> change.getArrivalAirport().equals(placeOfChange))
                .collect(Collectors.toList());

        List<Flight> secondFlight = FlightDatabase.getFlighDatabase().stream()
                .filter(change -> change.getDepartueAirport().equals(placeOfChange))
                .filter(arrival -> arrival.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        System.out.println("Flights from: " + departureAirport + " via " + placeOfChange + " to " + arrivalAirport);
        firstFlight.forEach(System.out::println);
        secondFlight.forEach(System.out::println);
    }
}
