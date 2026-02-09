package com.junfel.atm.controller;

import com.junfel.atm.model.Account;
import com.junfel.atm.view.ATMView;

import java.util.List;
import java.util.Scanner;

// Coordinates Model + View
public class ATMController {
    private final ATMView view;
    private final List<Account> accounts;
    private Account currentAccount;
    private boolean running;
    private boolean isLoggedIn;

    public ATMController(ATMView view, List<Account> accounts) {
        this.view = view;
        this.accounts = accounts;
    }

    public void start() {
        running = true;
        view.showWelcome();

        while (running) {
            login();
            runATM();
        }
    }

    private void login() {
        while (!isLoggedIn) {

            String name = view.userName();
            int pin = view.userPin();

            for (Account acc : accounts) {
                if (acc.getName().equalsIgnoreCase(name) && acc.validatePin(pin)) {
                    currentAccount = acc;
                    isLoggedIn = true;
                    view.showMessage("Login successful!\n");
                    return;
                }
            }
            view.showMessage("Invalid credentials. Try again.\n");
        }
    }

    private void runATM() {
        while (isLoggedIn) {
            view.showMenu();
            int choice = view.getChoice();

            switch (choice) {
                case 1:
                    view.showBalance(currentAccount.getBalance());
                    break;

                case 2:
                    double depositAmount = view.getAmount();
                    currentAccount.deposit(depositAmount);
                    view.showMessage("Deposit successful.");
                    view.showBalance(currentAccount.getBalance());
                    break;
                case 3:
                    double withdrawAmount = view.getAmount();
                    if (currentAccount.withdraw(withdrawAmount)) {
                        view.showMessage("Withdraw successful.");
                        view.showBalance(currentAccount.getBalance());
                    } else {
                        view.showMessage("Insufficient funds.");
                    }
                    break;
                case 4:
                    view.showMessage("Logout successful.");
                    isLoggedIn = false;
                    currentAccount = null;
                    break;
                case 5:
                    view.showMessage("Thank you for using ATM.");
                    isLoggedIn = false;
                    currentAccount = null;
                    running = false;
                    break;
                default:
                    view.showMessage("Invalid choice.");
            }
        }
    }
}
