package com.company.model.entity;

public class PersonEntity {
    private String username;
    private String password;
    private int data;
    private int money;

    public String getUsername() {
        return username;
    }

    public PersonEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PersonEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getData() {
        return data;
    }

    public PersonEntity setData(int data) {
        this.data = data;
        return this;
    }

    public int getMoney() {
        return money;
    }

    public PersonEntity setMoney(int money) {
        this.money = money;
        return this;
    }
}
