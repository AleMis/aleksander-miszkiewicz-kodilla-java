package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

//        Processor processor = new Processor();
//       processor.executre(() -> System.out.println("This is example"));

//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a,b) -> a + b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
//        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);
//
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("makaron",  String::toUpperCase);
        beautifier.beautify("trampolina", n -> "ABC" + n + "ABC");
        beautifier.beautify("żelasko", (String) -> String.replace('e', 'E'));
        beautifier.beautify("MONITOR", String::toLowerCase);


    }
}
