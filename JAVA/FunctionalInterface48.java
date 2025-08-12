package com.Assignment.Day1;
@FunctionalInterface
interface WorkerProcessor {
 void process(TeamMember member);
}
class TeamMember {
 private String name;
 private double salary;

 public TeamMember(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 public String getName() {
     return name;
 }

 public double getSalary() {
     return salary;
 }
}
public class FunctionalInterface48 {
 public static void main(String[] args) {
     TeamMember member = new TeamMember("Deepika", 50000.0);

     // Lambda to print name and salary
     WorkerProcessor printDetails = m ->
         System.out.println("Name: " + m.getName() + ", Salary: " + m.getSalary());

     // Lambda to print bonus (10% of salary)
     WorkerProcessor printBonus = m ->
         System.out.println("Bonus (10%): " + (m.getSalary() * 0.10));
     System.out.println("Team Member Details");
     printDetails.process(member);

     System.out.println("\nBonus Calculation");
     printBonus.process(member);
 }
}
