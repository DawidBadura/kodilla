package com.kodilla.stream.beautifier;

public class PoemBeafutifier {
    public String beautify(String text, PoemDecorator poemDecorator){
        return poemDecorator.decorate(text);
    }
}
