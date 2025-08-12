package com.Assignment.Day1;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class StudentValidation29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Register Number: ");
            String regNo = sc.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobileNo = sc.nextLine();
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register Number must have 9 characters.");
            }
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register Number contains invalid characters.");
            }
            if (mobileNo.length()!=10) {
                throw new IllegalArgumentException("Mobile Number have 10 digits.");
            }
            if (!mobileNo.matches("\\d+")) {
                throw new NumberFormatException("Mobile Number contain only digits.");
            }
            System.out.println("valid");

        } catch (IllegalArgumentException|NoSuchElementException e) {
            System.out.println("invalid");
        } finally {
           
        }
    }
}
