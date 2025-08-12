package com.Assignment.Day1;
import java.util.*;
interface Media {
 void displayInfo();
}
class Book implements Media {
 String title;
Book(String title) {
     this.title = title;
 }
public void displayInfo() {
     System.out.println("Book:" +title);
 }
}
class Video implements Media {
 String title;
Video(String title) {
     this.title = title;
 }
public void displayInfo() {
     System.out.println("Video: " +title);
 }
}
class Newspaper implements Media {
 String title;
Newspaper(String title) {
     this.title = title;
 }
public void displayInfo() {
     System.out.println("Newspaper: " + title);
 }
}
class GenericLibrary<T extends Media> {
 private List<T> items = new ArrayList<>();
public void add(T item) {
     items.add(item);
 }
public T retrieve(int index) {
     return items.get(index);
 }
public void displayAll() {
     for (T item : items) {
         item.displayInfo();
     }
 }
}
public class LibraryDemo39 {
 public static void main(String[] args) {
     GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
     bookLibrary.add(new Book("Java Programming"));
     bookLibrary.add(new Book("Data Structures"));
     GenericLibrary<Video> videoLibrary = new GenericLibrary<>();
     videoLibrary.add(new Video("Learning Java"));
     videoLibrary.add(new Video("OOP Concepts"));
     GenericLibrary<Newspaper> newspaperLibrary = new GenericLibrary<>();
     newspaperLibrary.add(new Newspaper("The Hindu"));
     newspaperLibrary.add(new Newspaper("Times of India"));
     System.out.println("Books:");
     bookLibrary.displayAll();
     System.out.println("\nVideos:");
     videoLibrary.displayAll();
     System.out.println("\nNewspapers:");
     newspaperLibrary.displayAll();
 }
}
