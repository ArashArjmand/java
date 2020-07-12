package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "arash", "myjava123");
            Scanner scanner = new Scanner(System.in);
            System.out.println("do you wanna 1.insert or 2.delete?");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    boolean flag = true;
                    first: while (flag){
                        PreparedStatement preparedStatement = connection.prepareStatement("insert into worker(id, name, mellicode, fathername, position, payment, year) values (?, ?, ?, ?, ?, ?, ?)");
                        System.out.println("id:");
                        int id = scanner.nextInt();
                        preparedStatement.setLong(1, id);
                        System.out.println("name:");
                        String name = scanner.next();
                        preparedStatement.setString(2, name);
                        System.out.println("mellicode:");
                        String mellicode = scanner.next();
                        preparedStatement.setString(3, mellicode);
                        System.out.println("father's name:");
                        String fathername = scanner.next();
                        preparedStatement.setString(4, fathername);
                        System.out.println("position:");
                        String position = scanner.next();
                        preparedStatement.setString(5, position);
                        System.out.println("payment:");
                        int payment = scanner.nextInt();
                        preparedStatement.setLong(6, payment);
                        System.out.println("worked years:");
                        int year = scanner.nextInt();
                        preparedStatement.setLong(7, year);
                        preparedStatement.executeUpdate();
                        System.out.println("insert 1.another or 2.exit?");
                        int j = scanner.nextInt();
                        if (j == 2) {
                            flag = false;
                            preparedStatement.close();
                            connection.close();
                        }
                    }
                    break;

                case 2:
                    PreparedStatement preparedStatement = connection.prepareStatement("delete from worker where id= ?");
                    System.out.println("which id number are you going to delete?");
                    int num = scanner.nextInt();
                    preparedStatement.setLong(1, num);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                    connection.close();
                    System.out.println("user deleted successfully");
                    break;



            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
