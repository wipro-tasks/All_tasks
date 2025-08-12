package com.Assignment.Day1;
import java.util.*;
import java.util.stream.*;
class Employee4 {
    int id;
    String name;
    String department;
    double salary;

    public Employee4(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

public class StreamEmployeeDemo50 {
    public static void main(String[] args) {

        List<Employee4> employees = Arrays.asList(
            new Employee4(101, "Ravi", "HR", 50000),
            new Employee4(102, "Priya", "IT", 60000),
            new Employee4(103, "Arun", "HR", 55000),
            new Employee4(104, "Kavya", "IT", 70000),
            new Employee4(105, "Divya", "Sales", 45000)
        );

        System.out.println("Q1. All employee names:");
        employees.stream().map(Employee4::getName).forEach(System.out::println);

        System.out.println("\nQ2. Employees with salary > 55000:");
        employees.stream().filter(e -> e.getSalary() > 55000).forEach(System.out::println);

        long hrCount = employees.stream().filter(e -> e.getDepartment().equals("HR")).count();
        System.out.println("\nQ3. Number of employees in HR: " + hrCount);

        System.out.println("\nQ4. Employees sorted by salary (desc):");
        employees.stream().sorted(Comparator.comparingDouble(Employee4::getSalary).reversed()).forEach(System.out::println);

        System.out.println("\nQ5. Highest paid employee:");
        employees.stream().max(Comparator.comparingDouble(Employee4::getSalary)).ifPresent(System.out::println);

        double avgSalary = employees.stream().mapToDouble(Employee4::getSalary).average().orElse(0);
        System.out.println("\nQ6. Average salary: " + avgSalary);

        List<String> names = employees.stream().map(Employee4::getName).collect(Collectors.toList());
        System.out.println("\nQ7. All employee names in List: " + names);

        System.out.println("\nQ8. Group employees by department:");
        Map<String, List<Employee4>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee4::getDepartment));
        groupedByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        System.out.println("\nQ9. Total salary per department:");
        Map<String, Double> totalSalByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee4::getDepartment, Collectors.summingDouble(Employee4::getSalary)));
        totalSalByDept.forEach((dept, total) -> System.out.println(dept + ": " + total));

        System.out.println("\nQ10. Names of IT employees sorted by salary:");
        employees.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .sorted(Comparator.comparingDouble(Employee4::getSalary))
            .map(Employee4::getName)
            .forEach(System.out::println);

        boolean anyLowSalary = employees.stream().anyMatch(e -> e.getSalary() < 40000);
        System.out.println("\nQ11. Any employee earns < 40000: " + anyLowSalary);

        String commaSeparated = employees.stream().map(Employee4::getName).collect(Collectors.joining(", "));
        System.out.println("\nQ12. Comma-separated names: " + commaSeparated);

        System.out.println("\nQ13. Top 2 highest earning employees:");
        employees.stream()
            .sorted(Comparator.comparingDouble(Employee4::getSalary).reversed())
            .limit(2)
            .forEach(System.out::println);

        System.out.println("\nQ14. Skip first 2 employees:");
        employees.stream().skip(2).forEach(System.out::println);

        System.out.println("\nQ15. First 3 employee names:");
        employees.stream().limit(3).map(Employee4::getName).forEach(System.out::println);

        System.out.println("\nQ16. Min salary in HR:");
        employees.stream()
            .filter(e -> e.getDepartment().equals("HR"))
            .min(Comparator.comparingDouble(Employee4::getSalary))
            .ifPresent(System.out::println);

        System.out.println("\nQ17. Partition salary > 55000:");
        Map<Boolean, List<Employee4>> partitioned = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        partitioned.forEach((k, v) -> {
            System.out.println((k ? "Above 55000" : "55000 or below") + ": " + v);
        });

        System.out.println("\nQ18. Map<Department, AverageSalary>:");
        Map<String, Double> avgSalByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee4::getDepartment, Collectors.averagingDouble(Employee4::getSalary)));
        avgSalByDept.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\nQ19. Sort by name then salary:");
        employees.stream()
            .sorted(Comparator.comparing(Employee4::getName).thenComparing(Employee4::getSalary))
            .forEach(System.out::println);

        System.out.println("\nQ20. Convert to Map<Id, Name>:");
        Map<Integer, String> idNameMap = employees.stream()
            .collect(Collectors.toMap(Employee4::getId, Employee4::getName));
        idNameMap.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n🔹 Challenge 1: Names starting with D and ending with a:");
        employees.stream()
            .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
            .forEach(System.out::println);

        System.out.println("\n🔹 Challenge 2: Departments with more than 1 employee:");
        groupedByDept.entrySet().stream()
            .filter(entry -> entry.getValue().size() > 1)
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue().size()));

        System.out.println("\n🔹 Challenge 3: Second highest salary:");
        employees.stream()
            .map(Employee4::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
