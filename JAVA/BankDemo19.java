package com.Assignment.Day1;
import java.util.*;

abstract class Bank {
    String accNo;
    String custName;
    int custGender; 
    String custJob;
    double curBal;

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public abstract double calcBalance();

    @Override
    public String toString() {
        String gender = (custGender == 1) ? "Male" : "Female";
        return "Account No: " + accNo +
               "\nName: " + custName +
               "\nGender: " + gender +
               "\nJob: " + custJob +
               "\nCurrent Balance: " + curBal +
               "\nUpdated Balance: " + calcBalance();
    }
}

class Saving extends Bank {
    double savRate;

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}

class Current extends Bank {
    boolean fixedDep;
    double curRate;

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep, double curRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.fixedDep = fixedDep;
        this.curRate = curRate;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150.0;
        }
        return balance;
    }
}

public class BankDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] customers = new Bank[5];
        customers[0] = new Saving("S001", "Deepika", 2, "Engineer", 5000, 0.04);
        customers[1] = new Current("C001", "Rahul", 1, "Doctor", 7000, true, 0.03);
        customers[2] = new Saving("S002", "Priya", 2, "Teacher", 6000, 0.045);
        customers[3] = new Current("C002", "Amit", 1, "Lawyer", 9000, false, 0.025);
        customers[4] = new Current("C003", "Sneha", 2, "Architect", 8000, true, 0.035);
        System.out.print("Enter account number to search: ");
        String searchAcc = sc.nextLine();
        boolean found = false;
        for (Bank b : customers) {
            if (b.accNo.equalsIgnoreCase(searchAcc)) {
                System.out.println("\nCustomer Found:");
                System.out.println(b);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer with account number " + searchAcc + " not found.");
        }
        int currentCount = 0;
        double totalBalance = 0;

        for (Bank b : customers) {
            if (b instanceof Current) {
                currentCount++;
                totalBalance += b.calcBalance();
            }
        }

        System.out.println("\nNumber of Current Account Customers: " + currentCount);
        System.out.println("Total Balance in Current Accounts: " + totalBalance);

        sc.close();
    }
}
