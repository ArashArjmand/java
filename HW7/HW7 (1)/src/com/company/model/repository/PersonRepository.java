package com.company.model.repository;

import com.company.model.entity.PersonEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonRepository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepository() throws Exception {
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "arash" , "myjava123");
        connection.setAutoCommit(false);
    }

    public void insert(PersonEntity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into persondata(username, password, data, money) values (?, ?, ?, ?)");
        preparedStatement.setString(1,entity.getUsername());
        preparedStatement.setString(2,entity.getPassword());
        preparedStatement.setLong(3,0);
        preparedStatement.setLong(4,0);
        preparedStatement.executeUpdate();
    }

    public void update(PersonEntity entity) throws  Exception {
        preparedStatement = connection.prepareStatement("update persondata set data = data + ?, money = money + ? where password = ?");
        preparedStatement.setLong(1, entity.getData());
        preparedStatement.setLong(2, entity.getMoney());
        preparedStatement.setString(3,entity.getPassword());
        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception {
        connection.commit();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
