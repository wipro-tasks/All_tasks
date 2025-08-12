package com.Assignment.Day1;
public class PersonTest21 {
    static abstract class Person {
        public abstract void eat();
        public abstract void exercise();
    }
static class Athlete extends Person {
        @Override
        public void eat() {
            System.out.println("Athlete eats food rich in proteins and carbs.");
        }
        @Override
        public void exercise() {
            System.out.println("Athlete trains several hours every day.");
        }
    }
    static class LazyPerson extends Person {
        @Override
        public void eat() {
            System.out.println("LazyPerson eats junk food.");
        }
        @Override
        public void exercise() {
            System.out.println("LazyPerson avoids exercise.");
        }
    }
public static void main(String[] args) {
        Person athlete=new Athlete();
        Person lazyPerson=new LazyPerson();
System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();
System.out.println("\nLazyPerson:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
