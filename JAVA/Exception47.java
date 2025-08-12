package com.Assignment.Day1;
class InvalidSalaryException extends Exception {
 public InvalidSalaryException(String message) {
     super(message);
 }
}
class Employee2 {
 private int id;
 private String name;
 private double salary;

 public Employee2(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public double getSalary() {
     return salary;
 }

 public String getName() {
     return name;
 }
}
class EmployeeService {

 public void validateSalary(double salary) throws InvalidSalaryException {
     if (salary < 0) {
         throw new InvalidSalaryException("Invalid salary: Salary cannot be negative.");
     }
 }

 public void processSalary(Employee2 emp) throws InvalidSalaryException {
     validateSalary(emp.getSalary());
     System.out.println("Processing salary for " + emp.getName() + ": " + emp.getSalary());
 }

 public void startProcess(Employee2 emp) throws InvalidSalaryException {
     processSalary(emp);
 }
}
public class Exception47 {
 public static void main(String[] args) {
     Employee2 emp = new Employee2(1, "Deepika", -5000.0);  // Negative salary
     EmployeeService service = new EmployeeService();

     try {
         service.startProcess(emp);
     } catch (InvalidSalaryException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
