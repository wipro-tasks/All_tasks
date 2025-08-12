package com.Assignment.Day1;

public class Calculator11 {
    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Addition: " + result);
    }

    public void diff(double a, double b) {
        double result = a - b;
        System.out.println("Difference: " + result);
    }

    public void mul(double a, double b) {
        double result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
