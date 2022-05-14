package com.example;


import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "28Vika200413";

    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement()){
            //statement.execute("INSERT INTO animal(id,animal_name, animal_desc) VALUES (2,'Elephant','big');");
            //statement.executeUpdate("UPDATE animal SET animal_name='Lion' WHERE id = 1");
            //statement.executeQuery("SELECT * FROM animal");
            //statement.addBatch("INSERT INTO animal(id,animal_name, animal_desc) VALUES(2,'Hippo','funny');");
            //statement.executeBatch();
            //statement.clearBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}