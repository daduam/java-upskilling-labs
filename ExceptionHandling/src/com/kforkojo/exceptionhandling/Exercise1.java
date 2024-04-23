package com.kforkojo.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

    public static void main(String[] args) throws Exception {
        try {
            readMissingFile("missing_file.txt");
        } catch (IOException ex) {
            System.out.println("Checked Exception: " + ex.getMessage());
        }

        try {
            divideByZero();
        } catch (ArithmeticException ex) {
            System.out.println("Unchecked Exception: " + ex.getMessage());
        }
    }

    private static void readMissingFile(String missingFilename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(missingFilename));

        if (reader != null) {
            reader.close();
        }
    }

    private static void divideByZero() {
        System.out.println(70 / 0);
    }
}
