package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> listOfContitnents = new ArrayList<>();

    public World(List<Continent> listOfContitnents) {
        this.listOfContitnents = listOfContitnents;
    }

    public List<Continent> getListOfContitnents() {
        return listOfContitnents;
    }


    public List<Continent> addContinents(Continent continent) {
        listOfContitnents.add(continent);
        return listOfContitnents;
    }


    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = listOfContitnents.stream()
                .flatMap(country -> country.getListOfCountires().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return worldPopulation;
    }
}
