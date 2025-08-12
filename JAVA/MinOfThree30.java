package com.Assignment.Day1;
import java.util.Scanner;
@FunctionalInterface
interface MinFunction {
 float apply(float a, float b, float c);
}

public class MinOfThree30 {
 public static float minimum3(float a, float b, float c) {
     return Math.min(a, Math.min(b, c));
 }
public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.print("Enter first value: ");
     float num1=scan.nextFloat();
     System.out.print("Enter second value: ");
     float num2=scan.nextFloat();
     System.out.print("Enter third value: ");
     float num3=scan.nextFloat();
     MinFunction minFunc = MinOfThree30::minimum3;
     float result = minFunc.apply(num1, num2, num3);
     System.out.println("Smallest value is: " +result);
 }
}
