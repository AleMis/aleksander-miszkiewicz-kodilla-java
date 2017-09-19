package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge challenge = new SecondChallenge();

        try  {
            System.out.println(challenge.probablyIWillThrowException(2.0, 1.5));
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        } finally {
            System.out.println("The result of the method should be 'Done!'");
        }

    }
}
