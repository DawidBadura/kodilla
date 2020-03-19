package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer>evenNumbers=new ArrayList<>();
        for(Integer a:numbers) {
            if(a%2==0) {
                evenNumbers.add(a);
            }
        }

        return evenNumbers;
    }
}
