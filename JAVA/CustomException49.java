package com.Assignment.Day1;
import java.util.Optional;
class MissingFieldException extends RuntimeException {
 public MissingFieldException(String message) {
     super(message);
 }
}

//Employee3 class with optional fields
class Employee3 {
 private String name;
 private int id;
 private Optional<String> email;
 private Optional<String> department;

 public Employee3(String name, int id, String email, String department) {
     this.name = Optional.ofNullable(name)
                         .orElseThrow(() -> new MissingFieldException("Name is required"));
     this.id = id;
     this.email = Optional.ofNullable(email);
     this.department = Optional.ofNullable(department);
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 public String getEmail() {
     return email.orElse("Email not provided");
 }

 public String getDepartment() {
     return department.orElse("Department not assigned");
 }

 public void printDetails() {
     System.out.println("Name: " + getName());
     System.out.println("ID: " + getId());
     System.out.println("Email: " + getEmail());
     System.out.println("Department: " + getDepartment());
 }
}

//Main class to test Employee3
public class CustomException49 {
 public static void main(String[] args) {
     // Case 1: All details provided
     Employee3 e1 = new Employee3("Deepika", 101, "deepika@example.com", "IT");
     e1.printDetails();

     System.out.println();

     // Case 2: Email and department are missing
     Employee3 e2 = new Employee3("Ravi", 102, null, null);
     e2.printDetails();

     System.out.println();

     // Case 3: Name is missing (throws exception)
     try {
         Employee3 e3 = new Employee3(null, 103, "someone@example.com", "HR");
     } catch (MissingFieldException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
