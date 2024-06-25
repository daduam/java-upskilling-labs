package kforkojo.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws Exception {
        String filename = "ExceptionHandling/numbers.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));

            try {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Number: " + Integer.parseInt(line));
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error parsing line: " + ex.getMessage());
            } finally {
                reader.close();
            }
        } catch (IOException ex) {
            System.out.println("Error processing file: " + ex.getMessage());
        }
    }
}
