package com.Assignment.Day1;
public class ShapeTest14 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        double squareSide=5.0;
        double rectLength=7.0;
        double rectWidth = 3.0;

        System.out.println("Square:");
        System.out.println("Area = " + shape.area(squareSide));
        System.out.println("Perimeter = " + shape.perimeter(squareSide));

        System.out.println("\nRectangle:");
        System.out.println("Area = " + shape.area(rectLength, rectWidth));
        System.out.println("Perimeter = " + shape.perimeter(rectLength, rectWidth));
    }
}
class Shape {
    public double area(double side) {
        return side*side;
    }
    public double area(double length, double width) {
        return length*width;
    }
    public double perimeter(double side) {
        return 4*side;
    }
    public double perimeter(double length, double width) {
        return 2*(length+width);
    }
}
