package com.Assignment.Day1;
import java.util.Scanner;
public class Bonus5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();
        System.out.print("Enter years of service: ");
        int yos = scan.nextInt();
        if(yos>6) {
            double bonus=salary*0.10; 
            System.out.println("You are eligible for bonus of: " + bonus);
        } 
        else {
            System.out.println("You are not eligible for bonus.");
        }

        
    }
}
