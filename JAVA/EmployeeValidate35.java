package com.Assignment.Day1;
import java.util.Scanner;
class InvalidEmployeeCode extends Exception {
 public InvalidEmployeeCode(String message) {
     super(message);
 }
}
class Employee {
 private String empCode;
 private String name;
 private int yearOfBirth;

 public Employee(String empCode, String name, int yearOfBirth) {
     this.empCode = empCode;
     this.name = name;
     this.yearOfBirth = yearOfBirth;
 }
public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Year of Birth: " +yearOfBirth);
     System.out.println("Employee Code: " +empCode);
 }
}
public class EmployeeValidate35 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Year of Birth: ");
         int yob = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Employee Code ");
         String code = sc.nextLine();
         if(!code.matches("\\d{2}-[FS]-\\d{3}")) {
             throw new InvalidEmployeeCode("Invalid Employee Code Expected format: YY-D-XXX (e.g., 81-F-112)");
         }
         Employee emp = new Employee(code, name, yob);
         emp.displayDetails();

     } catch (InvalidEmployeeCode e) {
         System.out.println("Error: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: "+e.getMessage());
     }
 }
}
