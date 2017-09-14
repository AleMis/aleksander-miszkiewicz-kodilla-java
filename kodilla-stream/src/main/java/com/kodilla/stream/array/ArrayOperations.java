package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

     static OptionalDouble getAvarage(int[] numbers) {
        //print
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n])); // za pomocą Instream.range nie potrafie

        //calculate average
         OptionalDouble result = IntStream.range(0, numbers.length)
                 .mapToDouble(d -> numbers[d])
                 .average();

        return result;
    }
}
