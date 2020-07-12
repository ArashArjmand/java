package com.company;

public class Person {
    private String username;
    private String name;
    private String password;
    private int age;
    private String address;
    private String phoneNumber;
    private String degree;

    public Person(String username, String name, String password, int age, String address, String phoneNumber, String degree) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.degree = degree;
    }

    public Person() {}
}
