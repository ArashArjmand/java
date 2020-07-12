package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","arash","myjava123");
            connection.setAutoCommit(false);
            System.out.println("do you want to insert a new account or update?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equals("insert")){
                PreparedStatement preparedStatement = connection.prepareStatement("insert into account(id, name, email, password, age, degree) values (?, ?, ?, ?, ?, ?)");
                System.out.println("id:");
                int id = scanner.nextInt();
                preparedStatement.setLong(1,id);
                System.out.println("name:");
                String name = scanner.next();
                preparedStatement.setString(2,name);
                System.out.println("email:");
                String email = scanner.next();
                preparedStatement.setString(3, email);
                System.out.println("password:");
                String password = scanner.next();
                preparedStatement.setString(4, password);
                System.out.println("age:");
                int age = scanner.nextInt();
                preparedStatement.setLong(5, age);
                System.out.println("degree:");
                String degree = scanner.next();
                preparedStatement.setString(6, degree);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
            else if (answer.equals("update")){
                PreparedStatement preparedStatement = connection.prepareStatement("update account set name = ?, email = ?, password = ?, age = ?, degree = ? where id = ?");
                System.out.println("wich id do you wanna update?");
                int i = scanner.nextInt();
                preparedStatement.setLong(6,i);
                System.out.println("name:");
                String name = scanner.next();
                preparedStatement.setString(1,name);
                System.out.println("email:");
                String email = scanner.next();
                preparedStatement.setString(2, email);
                System.out.println("password:");
                String password = scanner.next();
                preparedStatement.setString(3, password);
                System.out.println("age:");
                int age = scanner.nextInt();
                preparedStatement.setLong(4, age);
                System.out.println("degree:");
                String degree = scanner.next();
                preparedStatement.setString(5, degree);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            }
            else{
                System.out.println("Error");
            }
            connection.close();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }


    }
}
