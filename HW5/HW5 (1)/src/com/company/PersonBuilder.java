package com.company;

import java.io.Serializable;

public class PersonBuilder implements Serializable {
    private String username;
    private String name;
    private String password;
    private int age;
    private String address;
    private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDegree() {
        return degree;
    }

    private String degree;

    public PersonBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public Person createPerson() {
        return new Person(username, name, password, age, address, phoneNumber, degree);
    }
}