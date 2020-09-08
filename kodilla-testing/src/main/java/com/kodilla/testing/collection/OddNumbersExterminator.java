package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> exterminate(ArrayList<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer a : numbers) {
            if (a % 2 == 0) {
                evenNumbers.add(a);
            }
        }

        return evenNumbers;
    }
}
