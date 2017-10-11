package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Roll with sesame")
                .burgers(2)
                .sauce("Barbecue sauce")
                .ingredient("Salat")
                .ingredient("Cheese")
                .ingredient("Chili pepper")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String whichRoll = bigmac.getRoll();
        String whichSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Roll with sesame", whichRoll);
        Assert.assertEquals("Barbecue sauce", whichSauce);
    }

    @Test(expected = IllegalStateException.class)
    public void testBigMacIncorrectInputs() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Roll without sesame")
                .sauce("Ketchup")
                .ingredient("Ruccolla")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertNotEquals("Roll with sesame", bigmac.getRoll());
        Assert.assertNotEquals("Barbecue sauce", whichSauce);
    }
}
