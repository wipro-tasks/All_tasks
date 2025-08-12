package com.Assignment.Day1;
import java.util.Scanner;
public class Employee34 {
	private String employeeId;
    private String name;
    private int yearOfBirth;
    public Employee34(String employeeId,String name,int yearOfBirth) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public void displayDetails() {
        System.out.println("Name: "+ name);
        System.out.println("Year of Birth: " +yearOfBirth);
        System.out.println("Full Employee ID: " +employeeId);
        String[] parts = employeeId.split("-");
        if(parts.length==3) {
            String year=parts[0];
            String designationCode=parts[1];
            String number=parts[2];
            System.out.println("ID Year (last 2 digits): " + year);

            switch (designationCode.toUpperCase()) {
                case "F":
                    System.out.println("Designation: Faculty");
                    break;
                case "S":
                    System.out.println("Designation: Staff");
                    break;
                default:
                    System.out.println("Designation: Unknown");
            }

            System.out.println("ID Number: " + number);
        } else {
            System.out.println("Invalid Employee ID format.");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Year of Birth: ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee ID (format: YY-D-XXX, e.g., 81-F-112): ");
        String empId = sc.nextLine();
        Employee34 emp = new Employee34(empId, name, yearOfBirth);
        emp.displayDetails();
    }
}
