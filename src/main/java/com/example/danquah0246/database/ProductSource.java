package com.example.danquah0246.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductSource {
    public static void main(String[] args) {
        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/MYSQL Workbench";
            String username = "Young Legend";
            String password = "scientiA89$12345";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Use the connection for database operations
        Connection connection1 = DriverManager.getConnection(url,username, password);

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
