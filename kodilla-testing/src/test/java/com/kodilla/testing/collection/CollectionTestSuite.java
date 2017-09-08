package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: Collection Test is running");
    }

    @After
    public void after(){
        System.out.println("Test Case: Collection Test stopped");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> testEvenNumbersList = test.exterminate(numbers);
        ArrayList<Integer> nullList = new ArrayList<>();
        //Then
        Assert.assertEquals(nullList,testEvenNumbersList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //When
        numbers.add(3);
        numbers.add(23);
        numbers.add(44);
        numbers.add(2);
        numbers.add(222);
        numbers.add(2341);

        ArrayList<Integer> evenNumbersResult = test.exterminate(numbers);

        ArrayList<Integer> evenNumbersExpected = new ArrayList<>();
        evenNumbersExpected.add(44);
        evenNumbersExpected.add(2);
        evenNumbersExpected.add(222);

        //Then
        Assert.assertEquals(evenNumbersExpected, evenNumbersResult);
    }

}
