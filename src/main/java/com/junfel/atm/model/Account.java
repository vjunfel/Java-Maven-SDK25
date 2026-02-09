package com.junfel.atm.model;


// Holds data + business logic.
public class Account {
    private String name;
    private int pin;
    private double balance;

    public Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
