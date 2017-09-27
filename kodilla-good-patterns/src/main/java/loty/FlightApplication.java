package loty;

public class FlightApplication {

    public static void main (String args[]) {

        SearchFlights searchFlights = new SearchFlights();

        searchFlights.searchFlightsFromCity("Wrocław");
        searchFlights.searchFlightsToCity("Warszawa");
        searchFlights.searchFlightViaCityToCity("Wrocław", "Warszawa", "Berlin");
    }
}
