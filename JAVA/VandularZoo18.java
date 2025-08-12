package com.Assignment.Day1;
class Lion {
    private String color;
    private int age;
    private double weight;

    public Lion(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Roar";
    }

    public void printCharacteristics() {
        System.out.println("Lion -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

class Tiger {
    private String color;
    private int age;
    private double weight;

    public Tiger(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Growl";
    }

    public void printCharacteristics() {
        System.out.println("Tiger -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

class Deer {
    private String color;
    private int age;
    private double weight;

    public Deer(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Bleat";
    }

    public void printCharacteristics() {
        System.out.println("Deer -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

class Monkey {
    private String color;
    private int age;
    private double weight;

    public Monkey(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String sound() {
        return "Chatter";
    }

    public void printCharacteristics() {
        System.out.println("Monkey -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

class Elephant {
    private String color;
    private int age;
    private double weight;

    public Elephant(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Trumpet";
    }

    public void printCharacteristics() {
        System.out.println("Elephant -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

class Giraffe {
    private String color;
    private int age;
    private double weight;

    public Giraffe(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Hum";
    }

    public void printCharacteristics() {
        System.out.println("Giraffe -> Color: " + color + ", Age: " + age + ", Weight: " + weight);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
    }
}

public class VandularZoo18 {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 5, 190.5);
        Tiger tiger = new Tiger("Orange with black stripes", 4, 220.0);
        Deer deer = new Deer("Brown", 2, 120.0);
        Monkey monkey = new Monkey("Black", 3, 35.0);
        Elephant elephant = new Elephant("Gray", 10, 1000.0);
        Giraffe giraffe = new Giraffe("Yellow with brown patches", 6, 800.0);
        lion.printCharacteristics();
        System.out.println();
        tiger.printCharacteristics();
        System.out.println();
        deer.printCharacteristics();
        System.out.println();
        monkey.printCharacteristics();
        System.out.println();
        elephant.printCharacteristics();
        System.out.println();
        giraffe.printCharacteristics();
    }
}
