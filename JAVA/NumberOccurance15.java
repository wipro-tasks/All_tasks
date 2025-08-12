package com.Assignment.Day1;
import java.util.Arrays;

public class NumberOccurance15 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 5, 2, 3, 9, 1, 5, 2, 3};
        Arrays.sort(arr);
        int count=1;
        for(int i=1; i<arr.length;i++) {
            if(arr[i]==arr[i-1]) {
                count++;
            } else {
                System.out.println("Element " + arr[i - 1] + " occurs " + count + " time(s).");
                count = 1;  
            }
        }
        System.out.println("Element " + arr[arr.length - 1] + " occurs " + count + " time(s).");
    }
}
