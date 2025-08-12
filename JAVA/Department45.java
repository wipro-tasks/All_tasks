package com.Assignment.Day1;
import java.util.*;
import java.util.stream.Collectors;

class Student2 {
    private int id;
    private String name;
    private String department;

    public Student2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class Department45 {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2(1, "Alice", "CSE"));
        students.add(new Student2(2, "Bob", "ECE"));
        students.add(new Student2(3, "Charlie", "CSE"));
        students.add(new Student2(4, "David", "EEE"));
        students.add(new Student2(5, "Eve", "ECE"));

        // Grouping by department using Java 8 Streams
        Map<String, List<Student2>> groupedByDept = students.stream()
                .collect(Collectors.groupingBy(Student2::getDepartment));

        // Display each department and student names
        for (Map.Entry<String, List<Student2>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Student2 s : entry.getValue()) {
                System.out.println("  - " + s.getName());
            }
        }
    }
}
