package com.Assignment.Day1;
import java.io.*;
import java.util.Scanner;
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int emp_id;
    String emp_name;
    transient double emp_sal;
    public Employee(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }
    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_sal);
    }
}
public class Serialization38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        String filename = "employee.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(emp);
            System.out.println("\nEmployee object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}