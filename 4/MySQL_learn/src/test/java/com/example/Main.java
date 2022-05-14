package com.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

public class Main {
    private static final String HOST = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "28Vika200413";
    //private static final String INSERT_NEW = "INSERT INTO dish VALUES(?,?,?,?,?,?,?)";
    //private static final String GET_INFO = "SELECT * FROM dish";
    private static final String DELETE_INFO = "DELETE FROM dish WHERE id=?";

    public static void main(String[] args) {
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(HOST,USERNAME,PASSWORD);
            /*preparedStatement = connection.prepareStatement(INSERT_NEW);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Inserted title");
            preparedStatement.setString(3,"Inserted desc");
            preparedStatement.setFloat(4,0.2f);
            preparedStatement.setBoolean(5,true);
            preparedStatement.setDate(6,new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7,new FileInputStream("smile.png"));*/

            /*preparedStatement = connection.prepareStatement(GET_INFO);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String desc = resultSet.getString("descript");
                float rate = resultSet.getFloat("rating");
                boolean publ = resultSet.getBoolean("published");
                Date date = resultSet.getDate("created");
                byte[] icon = resultSet.getBytes("icon");

                System.out.println("{id: " + id
                        + ", title: " + title
                        + ", description: " + desc
                        + ", rating: " + rate
                        + ", published: " + publ
                        + ", date: " + date
                        + ", icon length: " + icon.length
                        + "}");
            }*/

            preparedStatement = connection.prepareStatement(DELETE_INFO);
            preparedStatement.setInt(1,2);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}