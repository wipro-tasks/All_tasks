package com.Assignment.Day1;

public class Calculator2 {
    public static void main(String[] args) {
        int number = 2345;
        int afterAddition = number + 8;
        int afterDivision = afterAddition / 3;
        int afterModulus = afterDivision % 5;
        int finalResult = afterModulus * 5;
        System.out.println("Result is : " + finalResult);
    }
}
