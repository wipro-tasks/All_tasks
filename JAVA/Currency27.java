package com.Assignment.Day1;
public class Currency27 {
    enum Currency {
        one,five,ten,twenty,fifty,hundred
    }
public static void main(String[] args) {
        System.out.println("currencies list\n");
        for (Currency c : Currency.values()) {
            System.out.print(c+": ");
            switch (c) {
                case one:
                    System.out.println("One dollar");
                    break;
                case five:
                    System.out.println("Five dollars");
                    break;
                case ten:
                    System.out.println("Ten dollars");
                    break;
                case twenty:
                    System.out.println("Twenty dollars");
                    break;
                case fifty:
                    System.out.println("Fifty dollars");
                    break;
                case hundred:
                    System.out.println("Hundred dollars");
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
