package com.kodilla.stream;

public class myNotes {
           /*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/



/*        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));



        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

//        People.getList().stream().map(s -> s.toUpperCase()).forEach(System.out::println);
//        People.getList().stream().forEach(System.out::println);
//        People.getList().stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
//        People.getList().stream().filter(s -> s.length() > 11).forEach(System.out::println);
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//do 7.2
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

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
        NumbersGenerator.generateEven(20);*/
}
