package com.Assignment.Day1;
public class WorkerTest13 {
    public static void main(String[] args) {
        Worker dailyWorker=new DailyWorker("Alice", 15.5);
        Worker salariedWorker=new SalariedWorker("Bob", 20.0);
        System.out.println("Worker Pay Calculation");
        dailyWorker.displayPay(38);   
        salariedWorker.displayPay(38); 
    }
}
class Worker {
    protected String name;
    protected double salaryRate;
    public Worker(String name,double salaryRate) {
        this.name=name;
        this.salaryRate=salaryRate;
    }
    public double pay(int hours) {
        return 0.0;
    }
    public void displayPay(int hours) {
        System.out.printf("Worker: %s, Pay: %.2f%n",name,pay(hours));
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name,double salaryRate) {
        super(name,salaryRate);
    }
    @Override
    public double pay(int hours) {
        return salaryRate*hours;
    }
}
class SalariedWorker extends Worker {
    public SalariedWorker(String name,double salaryRate) {
        super(name,salaryRate);
    }
    @Override
    public double pay(int hours) {
        return salaryRate*40;
    }
}
