package com.Assignment.Day1;
import java.util.Arrays;

public class ArraySum26 {
    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};
        Arrays.sort(input);
        int sumEven=0;
        int prev=Integer.MIN_VALUE;  
        for (int num:input) {
            if (num!=prev) {      
                if(num%2==0) {
                    sumEven+=num;
                }
                prev=num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
    }
}

