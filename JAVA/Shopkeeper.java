package com.Assignment.Day1;

import java.util.Scanner;

public class Shopkeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRetailValue = 0.0;
        boolean continueInput = true;
        System.out.println("Welcome to the Shopkeeper Billing System");
        System.out.println("Product Prices:");
        System.out.println("1 - $22.50");
        System.out.println("2 - $44.50");
        System.out.println("3 - $9.98");
        while (continueInput) {
            System.out.print("\nEnter product number (1-3): ");
            int productNumber = scanner.nextInt();
            System.out.print("Enter quantity sold: ");
            int quantity = scanner.nextInt();
            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number. Skipping this entry.");
                    continue;  
            }
            double itemTotal = price * quantity;
            totalRetailValue += itemTotal;
            System.out.printf("Added: %d x $%.2f = $%.2f\n", quantity, price, itemTotal);
            System.out.print("Do you want to enter another product? (Y/N): ");
            char choice = scanner.next().toUpperCase().charAt(0);
            if (choice != 'Y') {
                continueInput = false;
            }
        }
        System.out.printf("\nTotal retail value of all products sold: $%.2f\n", totalRetailValue);

        
    }
}
