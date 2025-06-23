package org.BankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public void createDatabaseConnection() {

        String url = "jdbc:mysql://localhost/bankdatabase";
        String user = "root";
        String password = "12345678";


        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connection Successful!");

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {

        new Main().createDatabaseConnection();




    }
}