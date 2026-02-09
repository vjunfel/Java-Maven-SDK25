package com.junfel.db;


public class Main {
    static void main() {
        System.out.println("Hello World");

        MyJDBC db = new MyJDBC();
        db.getConnection();

        System.out.println("Database Connected successfully");

        new UserDAO().getUsers();
    }
}
