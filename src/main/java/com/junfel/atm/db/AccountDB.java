package com.junfel.atm.db;

import com.junfel.atm.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountDB {
    private List<Account> accounts = new ArrayList<>();

    public List<Account> userList() {
        accounts.add(new Account("John", 1234, 1_000));
        accounts.add(new Account("Jane", 4321, 2_000));
        accounts.add(new Account("Mary", 1234, 2_500));
        accounts.add(new Account("Peter", 1234, 53_000));

        return accounts;
    }

}
