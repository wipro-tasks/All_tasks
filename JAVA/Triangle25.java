package com.Assignment.Day1;
import java.util.Scanner;
public class Triangle25 {
    public static double area(double a,double b,double c) {
        double s=(a+b+c)/2.0;  
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static double perimeter(double a,double b,double c) {
        return a+ b+c;
    }
    public static boolean isValid(double a,double b,double c) {
        return(a+b>c)&&(a+c>b)&&(b+c>a);
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side a: ");
            double a = scanner.nextDouble();
            if (a==-1) {
                System.out.println("Bye~");
                break;
            }
            System.out.print("Enter side b: ");
            double b=scanner.nextDouble();
            System.out.print("Enter side c: ");
            double c=scanner.nextDouble();
            if (isValid(a,b,c)) {
                double area=area(a, b, c);
                double perimeter=perimeter(a, b, c);
                System.out.printf("Area of the triangle: %.2f\n",area);
                System.out.printf("Perimeter of the triangle: %.2f\n",perimeter);
            } 
            else {
                System.out.println("The input is invalid.");
            }

        }

       
    }
}
