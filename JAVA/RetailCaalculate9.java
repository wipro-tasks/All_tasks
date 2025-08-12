package com.Assignment.Day1;
import java.util.Scanner;
public class RetailCaalculate9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double totalRetailValue=0.0;
        System.out.println("Enter product number and quantity sold:");
        while(true){
            System.out.print("Enter product number: ");
            int productNumber=scanner.nextInt();
            if(productNumber==0){
                break;
            }
            System.out.print("Enter quantity sold: ");
            int quantity = scanner.nextInt();
            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price=22.50;
                    break;
                case 2:
                    price=44.50;
                    break;
                case 3:
                    price=9.98;
                    break;
                default:
                    System.out.println("Invalid product number.Try again");
                    continue;
            }
            double itemTotal=price*quantity;
            totalRetailValue+=itemTotal;
            System.out.printf("Subtotal for product %d: $%.2f%n",productNumber,itemTotal);
        }
System.out.printf("Total retail value of all products sold: $%.2f%n", totalRetailValue);
       
    }
}
