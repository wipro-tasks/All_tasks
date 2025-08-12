package com.Assignment.Day1;
import java.util.Scanner;

public class AttendanceMedical8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of classes held
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        // Input: Number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        // Input validation
        if (classesHeld <= 0 || classesAttended < 0 || classesAttended > classesHeld) {
            System.out.println("Invalid input. Please enter valid class numbers.");
        } else {
            // Calculate attendance percentage
            double attendancePercent = (classesAttended * 100.0) / classesHeld;
            System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercent);

            // Check if attendance is sufficient
            if (attendancePercent >= 70) {
                System.out.println("You are allowed to sit in the exam.");
            } else {
                // Ask about medical cause
                System.out.print("Do you have a medical cause? (Y/N): ");
                char medicalCause = scanner.next().toUpperCase().charAt(0);

                if (medicalCause == 'Y') {
                    System.out.println("You are allowed to sit in the exam due to medical cause.");
                } else {
                    System.out.println("You are NOT allowed to sit in the exam.");
                }
            }
        }

        scanner.close();
    }
}
