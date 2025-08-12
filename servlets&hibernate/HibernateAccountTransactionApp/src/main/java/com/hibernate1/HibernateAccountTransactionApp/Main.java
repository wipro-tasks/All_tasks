package com.hibernate1.HibernateAccountTransactionApp;

import com.hibernate1.dao.AccountDAO;
import com.hibernate1.entity.Account;
import com.hibernate1.entity.Transaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.nextLine();

        Account acc = new Account();
        acc.setHolderName(holderName);

        System.out.print("How many transactions? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Transaction Description: ");
            String desc = sc.nextLine();
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();

            Transaction txn = new Transaction();
            txn.setDescription(desc);
            txn.setAmount(amt);
            acc.addTransaction(txn);
        }

        dao.addAccount(acc);
        dao.close();
        sc.close();

        System.out.println("Account and Transactions saved successfully.");
    }
}
