package com.Assignment.Day1;
import java.util.*;
class MyEmployee {
    private int id;
    private String name;
    private double salary;
    public MyEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public String toString() {
        return "ID: " +id + ", Name: " +name + ", Salary: " +salary;
    }
}
public class CustomSort44 {
    public static void main(String[] args) {
        List<MyEmployee> employees = new ArrayList<>();
        employees.add(new MyEmployee(101, "Ravi", 50000));
        employees.add(new MyEmployee(102, "Anita", 75000));
        employees.add(new MyEmployee(103, "Kiran", 60000));
        employees.add(new MyEmployee(104, "Meena", 75000));
        employees.sort(Comparator.comparingDouble(MyEmployee::getSalary).reversed());
        System.out.println("Sorted by Salary (descending):");
        employees.forEach(System.out::println);
        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        System.out.println("\nSorted by Name alphabetically:");
        employees.forEach(System.out::println);
    }
}
