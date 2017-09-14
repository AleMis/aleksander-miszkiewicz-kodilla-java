package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantityForContinent() {
        Country poland = new Country("Poland", new BigDecimal(36000000));
        Country germany = new Country("Germany", new BigDecimal(86000000));
        Country uk = new Country("Unitated Kingdon", new BigDecimal(88000000));
        List<Country> europeList = new ArrayList<>();
        europeList.add(poland);
        europeList.add(germany);
        europeList.add(uk);


        Country china = new Country("China", new BigDecimal(1370000000));
        Country india = new Country("India", new BigDecimal(1300000000));
        Country japan = new Country("Japan", new BigDecimal(65000000));
        List<Country> asiaList = new ArrayList<>();
        asiaList.add(china);
        asiaList.add(india);
        asiaList.add(japan);

        Continent europe = new Continent(europeList);
        Continent asia = new Continent(asiaList);


        BigDecimal europePeople = europe.getPeopleQuantity();
        BigDecimal europePeopleToTest = new BigDecimal("210000000");

        Assert.assertEquals(europePeopleToTest, europePeople);
    }

    @Test
    public void testGetPeopleQuantityForWorld() {
        Country poland = new Country("Poland", new BigDecimal(36000000));
        Country germany = new Country("Germany", new BigDecimal(86000000));
        Country uk = new Country("Unitated Kingdon", new BigDecimal(88000000));
        List<Country> europeList = new ArrayList<>();
        europeList.add(poland);
        europeList.add(germany);
        europeList.add(uk);


        Country china = new Country("China", new BigDecimal(1370000000));
        Country india = new Country("India", new BigDecimal(1300000000));
        Country japan = new Country("Japan", new BigDecimal(65000000));
        List<Country> asiaList = new ArrayList<>();
        asiaList.add(china);
        asiaList.add(india);
        asiaList.add(japan);

        Continent europe = new Continent(europeList);
        Continent asia = new Continent(asiaList);

        List<Continent> worldList= new ArrayList<>();
        worldList.add(europe);
        worldList.add(asia);
        World world = new World(worldList);

        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal worldPopulationToTest = new BigDecimal("2945000000");

        Assert.assertEquals(worldPopulationToTest, worldPopulation);
    }
}
