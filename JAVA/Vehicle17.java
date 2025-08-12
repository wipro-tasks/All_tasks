package com.Assignment.Day1;
public class Vehicle17 {
    public static void main(String[] args) {
        Truck t= new Truck("Red", 6, "Volvo FH");
        Bus b=new Bus("Blue", 4, "Mercedes Tourismo");
        Car c=new Car("White", 4, "Toyota Corolla");
        System.out.println("Information about truck");
        t.displayInformation();
        t.loadCargo();
        System.out.println("\nInformation about bus");
        b.displayInformation();
        b.pickPassengers();
        System.out.println("\nInformation about car");
        c.displayInformation();
        c.playMusic();
    }
}
class Vehicle {
    protected String color;
    protected int wheels;
    protected String model;
    public Vehicle(String color,int wheels,String model) {
        this.color=color;
        this.wheels=wheels;
        this.model=model;
    }

    public void displayInformation() {
        System.out.println("Model: " +model);
        System.out.println("Color: " +color);
        System.out.println("No. of Wheels: "+wheels);
    }
}
class Truck extends Vehicle {
    public Truck(String color, int wheels, String model) {
        super(color,wheels,model);
    }
    public void loadCargo() {
        System.out.println("Truck is loading heavy cargo.");
    }
}
class Bus extends Vehicle {
    public Bus(String color,int wheels,String model) {
        super(color,wheels,model);
    }

    public void pickPassengers() {
        System.out.println("Bus is picking up passengers.");
    }
}
class Car extends Vehicle {
    public Car(String color,int wheels,String model) {
        super(color,wheels, model);
    }
    public void playMusic() {
        System.out.println("Car is playing music.");
    }
}
