package com.Assignment.Day1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReader43{

    public static void main(String[] args) {
        String filePath="example.txt" 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("error occurred while reading the file:");
            System.out.println(e.getMessage());
        }
    }
}
