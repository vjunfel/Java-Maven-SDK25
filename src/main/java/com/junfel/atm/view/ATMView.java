package com.junfel.atm.view;

import java.util.Scanner;

// Handles input and output only.
public class ATMView {
    Scanner scanner = new Scanner(System.in);

    public void showWelcome() {
        System.out.println(" === Welcome to the ATM view === ");
    }

    public String userName() {
        System.out.print("Enter Username: ");
        return scanner.next();
    }

    public int userPin() {
        System.out.print("Please enter your pin: ");
        return scanner.nextInt();
    }

    public void showMenu() {
        System.out.println("CHOOSE AN OPTION");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Logout");
        System.out.println("5. Exit");
    }

    public int getChoice() {
        System.out.print("Please enter an option: ");
        return scanner.nextInt();
    }

    public double getAmount() {
        System.out.print("Enter amount: ");
        return scanner.nextDouble();
    }

    public void showBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

}
