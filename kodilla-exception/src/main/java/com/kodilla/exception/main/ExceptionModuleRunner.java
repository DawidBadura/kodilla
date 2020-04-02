package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderExeption;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderExeption e) {
            System.out.println("Problem While reading a file");
        }
    }
}
