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
            PreparedStatement preparedStatement;
            Scanner scanner = new Scanner(System.in);
            System.out.println("do you wanna 1.insert or 2.update or 3.delete?");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    preparedStatement = connection.prepareStatement("insert into student(id, name, year, grade) values (?, ?, ?, ?)");
                    System.out.println("id:");
                    int id = scanner.nextInt();
                    preparedStatement.setLong(1, id);
                    System.out.println("name:");
                    String name = scanner.next();
                    preparedStatement.setString(2, name);
                    System.out.println("year:");
                    int year = scanner.nextInt();
                    preparedStatement.setLong(3, year);
                    System.out.println("grade:");
                    int grade = scanner.nextInt();
                    preparedStatement.setLong(4, grade);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    break;
                case 2:
                    System.out.println("which id do you wanna update?");
                    int id1 = scanner.nextInt();
                    System.out.println("which part you wanna update? 1.name 2.year 3.grade");
                    int j = scanner.nextInt();
                    switch (j){
                        case 1:
                            preparedStatement = connection.prepareStatement("update student set name = ? where id = ?");
                            System.out.println("set new name:");
                            String name1 = scanner.next();
                            preparedStatement.setLong(2, id1);
                            preparedStatement.setString(1, name1);
                            preparedStatement.executeUpdate();
                            preparedStatement.close();
                            connection.close();
                            break;
                        case 2:
                            preparedStatement = connection.prepareStatement("update student set year = ? where id = ?");
                            System.out.println("set new year:");
                            int year1 = scanner.nextInt();
                            preparedStatement.setLong(2, id1);
                            preparedStatement.setLong(1, year1);
                            preparedStatement.executeUpdate();
                            preparedStatement.close();
                            connection.close();
                            break;
                        case 3:
                            preparedStatement = connection.prepareStatement("update student set grade = ? where id = ?");
                            System.out.println("set new grade:");
                            int grade1 = scanner.nextInt();
                            preparedStatement.setLong(2, id1);
                            preparedStatement.setLong(1, grade1);
                            preparedStatement.executeUpdate();
                            preparedStatement.close();
                            connection.close();
                            break;
                    }
                    break;
                case 3:
                    preparedStatement = connection.prepareStatement("delete from student where id = ?");
                    System.out.println("which id do you wanna delete?");
                    int id2 = scanner.nextInt();
                    preparedStatement.setLong(1, id2);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    break;
            }
            scanner.close();


        } catch (ClassNotFoundException e){
	        e.printStackTrace();
        } catch (SQLException e){
	        e.printStackTrace();
        }
    }
}
