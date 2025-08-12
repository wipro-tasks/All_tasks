package com.Assignment.Day1;
public class Student12 {
    
    private static int rollCounter = 1;
    private int rollNo;
    private String studentName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;
    public Student12() {
        this.rollNo = rollCounter++;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getMarksInEng() {
        return marksInEng;
    }
    public int getMarksInMaths() {
        return marksInMaths;
    }
    public int getMarksInScience() {
        return marksInScience;
    }
    public void setStudName(String studentName) {
        this.studentName=studentName;
    }
    public void setMarksInEng(int marksInEng) {
        this.marksInEng=marksInEng;
    }
    public void setMarksInMaths(int marksInMaths) {
        this.marksInMaths=marksInMaths;
    }
    public void setMarksInScience(int marksInScience) {
        this.marksInScience=marksInScience;
    }
    public void display() {
        System.out.println("Roll No: " +rollNo);
        System.out.println("Name: " +studentName);
        System.out.println("English: " +marksInEng);
        System.out.println("Maths: " +marksInMaths);
        System.out.println("Science: " +marksInScience);
        
    }
}
