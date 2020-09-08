package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).forEach(value -> System.out.println(numbers[value]));
        OptionalDouble result = IntStream.range(0, numbers.length).map(number -> number = numbers[number]).average();
        if (result.isPresent()) {
            return result.getAsDouble();
        } else {
            return 0;
        }
    }
}
