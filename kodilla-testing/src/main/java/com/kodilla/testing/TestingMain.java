package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theFormUser");

        String result = simpleUser.getUserName();

        if(result.equals("theFormUser")) {
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }

        //+++++++++++++++++++++++++++++++++++++++++++

        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,2);
        if((addResult %1) ==0) {
            System.out.println("Adding method test is OK");
        }else {
            System.out.println("Error!");
        }

        int subtractResult = calculator.subtract(5,2);
        if((subtractResult %1) ==0) {
            System.out.println("Subtracting method test is OK");
        }else {
            System.out.println("Error!");
        }


    }


}
