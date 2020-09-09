package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuequeStudentTestSuite {

    @Test
    public void testUpdateQueque() {
        //Given
        QuequeStudent johnyb = new QuequeStudent("Johny Bravo");
        QuequeStudent easyboy = new QuequeStudent("Criss Jenkins");
        QuequeStudent easygirl = new QuequeStudent("Pamela Anders");
        QuequeStudent antonio = new QuequeStudent("Antonio Banderas");
        Master mentor1 = new Master("Robert Kubica");
        Master mentor2 = new Master("Diablo Włodarczyk");
        johnyb.registerMentor(mentor1);
        easyboy.registerMentor(mentor1);
        easygirl.registerMentor(mentor2);
        easygirl.registerMentor(mentor1);
        antonio.registerMentor(mentor2);
        //When
        johnyb.putTask("2.3");
        johnyb.putTask("2.2");
        johnyb.putTask("2.5");
        easyboy.putTask("1.1");
        easygirl.putTask("1.5");
        antonio.putTask("3.1");
        //Then
        assertEquals(5, mentor1.getCount());
        assertEquals(2, mentor2.getCount());
    }
}