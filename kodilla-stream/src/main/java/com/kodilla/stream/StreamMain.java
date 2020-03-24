package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeafutifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeafutifier poemBeafutifier = new PoemBeafutifier();
        System.out.println(poemBeafutifier.beautify("Taki sobie text",text -> text.toUpperCase()));
        System.out.println(poemBeafutifier.beautify("Taki sobie text",text -> "ABC"+text+"CBA"));
        System.out.println(poemBeafutifier.beautify("Taki sobie text",text -> text.replace('e','B')));
        System.out.println(poemBeafutifier.beautify("Taki sobie text",text -> text.replaceFirst("s","BrrrB")));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



    }

}
