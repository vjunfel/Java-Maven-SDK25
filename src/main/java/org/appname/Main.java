package org.appname;


import org.appname.forex.db.MyJDBC;
import org.appname.forex.db.UserDao;

import java.sql.Statement;

public class Main {
    static void main() {
        System.out.println("Hello World");

//        MyJDBC db = new MyJDBC();
//        db.getConnection();

        new UserDao().getUsers();
    }
}
