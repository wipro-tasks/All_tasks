package com.Assignment.Day1;
import java.util.Scanner;
public class BikerRace24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[] speeds=new double[5];
        double sum = 0;
        for (int i=0; i<5;i++) {
            System.out.print("Enter speed of biker " +(i+1)+ ": ");
            speeds[i] = scan.nextDouble();
            sum+=speeds[i];
        }
        double avg=sum/5;
        System.out.printf("Average speed: %.2f\n",avg);
        System.out.println("Qualifying racers:");
        boolean anyQualified = false;
        for (int i=0; i<5;i++) {
            if(speeds[i]>avg) {
                System.out.printf("Biker %d: %.2f\n",i+1,speeds[i]);
                anyQualified = true;
            }
        }
        if(!anyQualified) {
            System.out.println("No racer qualified.");
        }
    }
}
