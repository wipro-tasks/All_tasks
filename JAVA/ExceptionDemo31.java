package com.Assignment.Day1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo31 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter integer: ");
            int num = sc.nextInt(); 
            System.out.println("You entered: " +num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException : Please enter a valid integer.");
        }
        sc.nextLine();
        try{
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("Enter the index: ");
            int index = sc.nextInt(); 
            char ch = str.charAt(index); 
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException:Invalid index for string.");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException:Index must be an integer.");
        }
    }
}
