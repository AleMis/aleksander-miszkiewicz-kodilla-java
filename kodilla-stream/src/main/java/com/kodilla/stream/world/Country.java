package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country implements PeopleQuantity{

    private final String country;
    private final BigDecimal quantityOfPeople;

    public Country(String country, BigDecimal quantityOfPeople) {
        this.country = country;
        this.quantityOfPeople = quantityOfPeople;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal quantity = new BigDecimal(String.valueOf(quantityOfPeople));
        return quantity;
    }

    @Override
    public String toString() {
        return country + " " + quantityOfPeople;
    }
}
