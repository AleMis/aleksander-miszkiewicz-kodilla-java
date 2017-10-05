package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = (Calculator) context.getBean("calculator");

        //When
        Double resultOfAdding = calculator.add(10.0, 55.3);
        Double resultOfSubtracting = calculator.sub(442,23.4);
        Double resultOfMultipling = calculator.mul(3, 2.5);
        Double resultOfDividing = calculator.div(10, 2);

        //Then
        Assert.assertEquals(65.3, resultOfAdding, 0);
        Assert.assertEquals(418.6, resultOfSubtracting, 0);
        Assert.assertEquals(7.5, resultOfMultipling, 0);
        Assert.assertEquals(5.0, resultOfDividing,0);


    }


}
