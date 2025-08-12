package com.Assignment.Day1;
import java.util.Scanner;
class LowSalException extends Exception {
 public LowSalException(String message) {
     super(message);
 }
}
public class EmpClass33 {
 static class Emp {
     private int empId;
     private String empName;
     private String designation;
     private double basic;
     private double hra; 
     public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
         if (basic<50000) {
             throw new LowSalException("Basic salary must be at least 50000.");
         }

         this.empId = empId;
         this.empName = empName;
         this.designation = designation;
         this.basic = basic;

         calculateHRA(); 
     }
     private void calculateHRA() {
         switch (designation.toLowerCase()) {
             case "manager":
                 hra = 0.10 * basic;
                 break;
             case "teamleader":
                 hra = 0.12 * basic;
                 break;
             case "hr":
                 hra = 0.05 * basic;
                 break;
             default:
                 hra = 0.0;
         }
     }
     public void printDET() {
         System.out.println("ID: "+empId);
         System.out.println("Name: "+empName);
         System.out.println("Designation: "+designation);
         System.out.println("Basic Salary: "+basic);
         System.out.println("HRA: " + hra);
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
try {
         System.out.print("Enter Employee ID: ");
         int id = sc.nextInt();
         sc.nextLine(); 
         System.out.print("Enter Employee Name: ");
         String name = sc.nextLine();
         System.out.print("Enter Designation (Manager / TeamLeader / HR): ");
         String desig = sc.nextLine();
         System.out.print("Enter Basic Salary: ");
         double basic = sc.nextDouble();
         Emp emp = new Emp(id, name, desig, basic);
         emp.printDET();
} catch(LowSalException e) {
         System.out.println("LowSalException caught: " + e.getMessage());
     }catch(Exception e) {
         System.out.println("Something wrong: " + e.getMessage());
     }
 }
}
