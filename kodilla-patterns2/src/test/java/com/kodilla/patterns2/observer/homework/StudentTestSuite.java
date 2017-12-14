package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {

    @Test
    public void testInformMentor() {
        //Given
        Mentor michal = new Mentor("Michał");
        Mentor rafal = new Mentor("Rafał");

        Student olek = new Student(michal, "Olek");
        Student marek = new Student(rafal, "Marek");
        Student pawel = new Student(michal, "Paweł");

        //When
        olek.addExercise("Observator exercise finished!");
        marek.addExercise("For loop exercise finished!");
        pawel.addExercise("All exercises for design patterns finished");

        //Then
        assertEquals(2, michal.getUpdateCount());
        assertEquals(1, rafal.getUpdateCount());
    }

    @Test
    public void testGetExercise() {
        //Given
        Mentor michal = new Mentor("Michał");
        Mentor rafal = new Mentor("Rafał");

        Student olek = new Student(michal, "Olek");
        Student marek = new Student(rafal, "Marek");
        Student pawel = new Student(michal, "Paweł");

        //When
        olek.addExercise("Observator exercise finished!");
        olek.addExercise("Test for observator added!");
        marek.addExercise("For loop exercise finished!");
        pawel.addExercise("All exercises for design patterns finished");

        String exerciseCheckByMichal = michal.getExerciseToCheck(olek);
        String exerciseCheckByRafal =  rafal.getExerciseToCheck(pawel);

        //Then
        assertEquals("Observator exercise finished!", exerciseCheckByMichal);
        assertEquals("All exercises for design patterns finished", exerciseCheckByRafal);
    }

    @Test
    public void testSubmitExercise() {
        //Given
        Mentor michal = new Mentor("Michał");
        Mentor rafal = new Mentor("Rafał");

        Student olek = new Student(michal, "Olek");
        Student marek = new Student(rafal, "Marek");
        Student pawel = new Student(michal, "Paweł");

        //When
        olek.addExercise("Observator exercise finished!");
        olek.addExercise("Test for observator added!");
        marek.addExercise("For loop exercise finished!");
        pawel.addExercise("All exercises for design patterns finished");

        michal.submitExercise(olek);
        rafal.submitExercise(pawel);

        //Then
        assertEquals(1, olek.getExercise().size());
        assertEquals(0, pawel.getExercise().size());
    }
}
