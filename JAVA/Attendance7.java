package com.Assignment.Day1;
import java.util.Scanner;

public class Attendance7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int classHeld=scan.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classAttended=scan.nextInt();
        if (classHeld<=0||classAttended<0||classAttended>classHeld) {
            System.out.println("Invalid input. Please check your numbers.");
        } else {
        	double attendancePercentage=(classAttended*100.0)/classHeld;
        	System.out.printf("Attendance Percentage: %.2f%%\n",attendancePercentage);
        	if(attendancePercentage>=70){
                System.out.println("You are allowed to sit in the exam.");
            } 
        	else{
                System.out.println("You are not allowed to sit in the exam.");
            }
        }
        
}
}
