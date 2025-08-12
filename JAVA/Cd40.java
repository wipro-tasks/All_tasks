package com.Assignment.Day1;
import java.util.*;
class CD implements Comparable<CD> {
 private String title;
 private String singer;
public CD(String title, String singer) {
     this.title = title;
     this.singer = singer;
 }
public String getTitle() {
     return title;
 }
public String getSinger() {
     return singer;
 }
 @Override
 public int compareTo(CD other) {
     return this.singer.compareToIgnoreCase(other.singer);
 }
@Override
 public String toString() {
     return "CD [Title: " + title + ", Singer: " + singer + "]";
 }
}

public class Cd40 {
 public static void main(String[] args) {
     List<CD> cdList = new ArrayList<>();
     cdList.add(new CD("Love Tunes", "Zayn"));
     cdList.add(new CD("Melody Mix", "Ariana"));
     cdList.add(new CD("Summer Vibes", "Charlie"));
     cdList.add(new CD("Classical Touch", "Beethoven"));
System.out.println("Before Sorting:");
     for (CD cd : cdList) {
         System.out.println(cd);
     }
Collections.sort(cdList); 
     System.out.println("\nAfter Sorting in (Ascending):");
     for (CD cd : cdList) {
         System.out.println(cd);
     }
 }
}
