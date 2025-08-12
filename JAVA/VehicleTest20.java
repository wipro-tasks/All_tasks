package com.Assignment.Day1;
public class VehicleTest20 {
	static abstract class Vehicle {
        public abstract void startEngine();
        public abstract void stopEngine();
    }
	static class Car extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Car engine started with key ignition.");
        }
        @Override
        public void stopEngine() {
            System.out.println("Car engine stopped by turning off the key.");
        }
    }
	static class Motorcycle extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Motorcycle engine started with electric starter.");
        }
        @Override
        public void stopEngine() {
            System.out.println("Motorcycle engine stopped by kill switch.");
        }
    }
	public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        System.out.println("Car information");
        car.startEngine();
        car.stopEngine();
        System.out.println("\nMotorcycle information");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
