package com.Assignment.Day1;
public class Grade3 {
    public static void main(String[] args) {
        int total = 90;
        int boys = 45;
        int girls = total-boys;
        int gradeA = total/2;
        int bGradeA = 20;
        int gGradeA = gradeA - bGradeA;
        System.out.println("No of girls got grade 'A': " +gGradeA);
    }
}
