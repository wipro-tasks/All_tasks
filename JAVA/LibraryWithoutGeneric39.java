package com.Assignment.Day1;
import java.util.*;
class NonGenericLibrary {
 private List<Object> items = new ArrayList<>();
public void add(Object item) {
     items.add(item);
 }
public Object retrieve(int index) {
     return items.get(index);
 }
public void displayAll() {
     for (Object item : items) {
         if (item instanceof Book) {
             ((Book) item).displayInfo();
         } else if (item instanceof Video) {
             ((Video) item).displayInfo();
         } else if (item instanceof Newspaper) {
             ((Newspaper) item).displayInfo();
         } else {
             System.out.println("Unknown media");
         }
     }
 }
}
class NonGenericDemo {
 public static void main(String[] args) {
     NonGenericLibrary lib = new NonGenericLibrary();
     lib.add(new Book("Effective Java"));
     lib.add(new Video("Spring Boot Tutorial"));
     lib.add(new Newspaper("Indian Express"));
     System.out.println("Non-Generic Library Contents:");
     lib.displayAll();
 }
}
