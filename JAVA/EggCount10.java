package com.Assignment.Day1;
public class EggCount10 {
    public static void main(String[] args) {
        int eggs=Integer.parseInt(args[0]);
        displayEggBreakdown(eggs);
    }
    public static void displayEggBreakdown(int totalEggs) {
        int gross=totalEggs/144;
        int dozen=(totalEggs%144)/12;
        int leftover=totalEggs%12;
        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d.%n",gross,dozen,leftover);
    }
}
