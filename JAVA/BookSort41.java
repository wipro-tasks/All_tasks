package com.Assignment.Day1;
import java.util.*;
class BookStore {
 private int bookId;
 private String bookName;
public BookStore(int bookId, String bookName) {
     this.bookId=bookId;
     this.bookName=bookName;
 }
public int getBookId() {
     return bookId;
 }
public String getBookName() {
     return bookName;
 }
@Override
 public String toString() {
     return "Book [ID: " +bookId + ",Name: "+bookName + "]";
 }
}
class SortByBookName implements Comparator<BookStore> {
 public int compare(BookStore b1, BookStore b2) {
     return b1.getBookName().compareToIgnoreCase(b2.getBookName());
 }
}
class SortByBookId implements Comparator<BookStore> {
 public int compare(BookStore b1, BookStore b2) {
     return Integer.compare(b1.getBookId(), b2.getBookId());
 }
}
public class BookSort41 {
 public static void main(String[] args) {
     List<BookStore> books=new ArrayList<>();
     books.add(new BookStore(103,"Java Programming"));
     books.add(new BookStore(101,"Data Structures"));
     books.add(new BookStore(105,"Algorithms"));
     books.add(new BookStore(102,"Operating Systems"));
     System.out.println("Original Book List:");
     for (BookStore book : books) {
         System.out.println(book);
     }
     Collections.sort(books, new SortByBookName());
     System.out.println("\nSorted by Book Name:");
     for (BookStore book : books) {
         System.out.println(book);
     }
     Collections.sort(books, new SortByBookId());
     System.out.println("\nSorted by Book ID:");
     for (BookStore book : books) {
         System.out.println(book);
     }
 }
}
