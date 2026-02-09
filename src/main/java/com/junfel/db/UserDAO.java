package com.junfel.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {

    public void getUsers() {

        String SQLStatement = "select * from users";

        try (Connection con = MyJDBC.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SQLStatement)) {

            System.out.println("Getting Users to database...");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("user_phone") + " " +
                    rs.getString("user_name")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished");
        }
    }
}
