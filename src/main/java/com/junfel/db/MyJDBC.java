package com.junfel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {
    private static final String URL = EnvLoader.getProperty("DB_URL");
    private static final String USER = EnvLoader.getProperty("DB_USER");
    private static final String PASSWORD = EnvLoader.getProperty("DB_PASSWORD");

    public static Connection getConnection() {
        try {
            return  DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to DB", e);
        }
    }
}
