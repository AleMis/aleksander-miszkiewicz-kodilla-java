package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String string, PoemDecorator decorator) {
        String word = decorator.decorate(string);
        System.out.println("Beautiful word is " + word);

    }
}
