package com.junfel.atm;

import com.junfel.atm.controller.ATMController;
import com.junfel.atm.db.AccountDB;
import com.junfel.atm.model.Account;
import com.junfel.atm.view.ATMView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccountDB user = new AccountDB();
        List<Account> accounts = user.userList();

        System.out.println("Accounts: " + accounts.size());


        ATMView view = new ATMView();
        ATMController atmController = new ATMController(view, accounts);

        atmController.start();
    }
}
