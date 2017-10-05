package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    public void displayValue(Double val) {
        System.out.println("Value: " + val);
    }
}
