package com.company.model.repository;

import com.company.model.entity.SaipaEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaipaRepository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public SaipaRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","arash","myjava123");
        connection.setAutoCommit(false);
    }

    public void insert(SaipaEntity entity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into saipa(id, name, color, price) values (?, ?, ?, ?)");
        preparedStatement.setLong(1, entity.getId());
        preparedStatement.setString(2, entity.getName());
        preparedStatement.setString(3, entity.getColor());
        preparedStatement.setLong(4, entity.getPrice());
        preparedStatement.executeUpdate();
    }

    public void commit() throws Exception{
        connection.commit();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
