package com.Assignment.Day1;
import java.io.*;
import java.util.*;
public class Files37 {
public static void main(String[] args) {
        String fileName="batchmates.txt";
        List<String> batchMates=Arrays.asList(
            "Deepika Mittapalli",
            "gupta Kumar",
            "ganesh",
            "harshitha",
            "nikhil"
        );
        try (BufferedWriter writer=new BufferedWriter(new FileWriter(fileName))) {
            for (String name : batchMates) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Batch name uploaded successfully.");
        } catch (IOException e) {
            System.out.println("Error" +e.getMessage());
        }
        try (BufferedReader reader=new BufferedReader(new FileReader(fileName))) {
            String name;
            while ((name=reader.readLine())!=null) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.out.println("Error" +e.getMessage());
        }
    }
}
