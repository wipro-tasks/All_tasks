package com.Assignment.Day1;
interface Drawable {
 void drawingColor();
 void thickness();
}
interface Fillable {
 void fillingColor();
 void size();
}
class Line implements Drawable {
 @Override
 public void drawingColor() {
     System.out.println("Line drawing color: Black");
 }
 @Override
 public void thickness() {
     System.out.println("Line thickness: 2px");
 }
}
class Circle implements Drawable, Fillable {
 @Override
 public void drawingColor() {
     System.out.println("Circle drawing color: Blue");
 }
@Override
 public void thickness() {
     System.out.println("Circle border thickness: 3px");
 }
@Override
 public void fillingColor() {
     System.out.println("Circle filling color: Yellow");
 }
@Override
 public void size() {
     System.out.println("Circle size: Radius 10");
 }
}
class Square implements Drawable, Fillable {
 @Override
 public void drawingColor() {
     System.out.println("Square drawing color: Red");
 }
@Override
 public void thickness() {
     System.out.println("Square border thickness: 4px");
 }
@Override
 public void fillingColor() {
     System.out.println("Square filling color: Green");
 }
@Override
 public void size() {
     System.out.println("Square size: Side length 15");
 }
}
public class ShapeTest22 {
 public static void main(String[] args) {
     Line line=new Line();
     Circle circle=new Circle();
     Square square=new Square();
     System.out.println("Line:");
     line.drawingColor();
     line.thickness();
     System.out.println("\nCircle:");
     circle.drawingColor();
     circle.thickness();
     circle.fillingColor();
     circle.size();
     System.out.println("\nSquare:");
     square.drawingColor();
     square.thickness();
     square.fillingColor();
     square.size();
 }
}
