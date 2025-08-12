package com.Assignment.Day1;
import java.util.*;
class Repository<T, ID> {
 private Map<ID, T> storage = new HashMap<>();

 public void save(ID id, T entity) {
     storage.put(id, entity);
 }

 public T findById(ID id) {
     return storage.get(id);
 }

 public List<T> findAll() {
     return new ArrayList<>(storage.values());
 }

 public void deleteById(ID id) {
     storage.remove(id);
 }
}
class StaffMember {
 private int id;
 private String name;
 private double salary;

 public StaffMember(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 public int getId() {
     return id;
 }

 @Override
 public String toString() {
     return "StaffMember{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            '}';
 }
}
public class RepositoryDemo46 {
 public static void main(String[] args) {
     Repository<StaffMember, Integer> repo = new Repository<>();
     StaffMember s1 = new StaffMember(1, "Alice", 50000.0);
     StaffMember s2 = new StaffMember(2, "Bob", 60000.0);
     StaffMember s3 = new StaffMember(3, "Charlie", 55000.0);
     repo.save(s1.getId(), s1);
     repo.save(s2.getId(), s2);
     repo.save(s3.getId(), s3);
     System.out.println("All staff members:");
     for (StaffMember sm : repo.findAll()) {
         System.out.println(sm);
     }
     System.out.println("\nStaff member with ID 2:");
     System.out.println(repo.findById(2));
     repo.deleteById(1);
     System.out.println("\nAfter deleting staff member with ID 1:");
     for (StaffMember sm : repo.findAll()) {
         System.out.println(sm);
     }
 }
}
