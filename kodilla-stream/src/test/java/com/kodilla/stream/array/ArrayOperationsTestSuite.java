package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAvarage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {3,4,5,6,7,8};

        //When
        OptionalDouble averageResult = getAvarage(numbers);
        OptionalDouble averageTest = OptionalDouble.of(5.5);
        //Then

        Assert.assertEquals(averageTest, averageResult);

    }
}
