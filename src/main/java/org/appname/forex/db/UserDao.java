package org.appname.forex.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
    public void getUsers() {
        System.out.println("Connecting to database...");

        String SQLStatement = "select * from users";

        try (Connection con = MyJDBC.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(SQLStatement)) {

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
