package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {

    private List<Country> listOfCountries = new ArrayList<>();

    public Continent(List<Country> listOfCountires) {
        this.listOfCountries = listOfCountires;
    }

    public List<Country> getListOfCountires() {
        return listOfCountries;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal bigDecimal = listOfCountries.stream()
                .map(PeopleQuantity::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return bigDecimal;
    }
}
