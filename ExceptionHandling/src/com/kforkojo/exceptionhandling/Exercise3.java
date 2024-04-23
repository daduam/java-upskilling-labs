package com.kforkojo.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise3 {

    public static void main(String[] args) throws Exception {
        String filename = "sentence.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + " ");
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error processing file: " + ex.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
