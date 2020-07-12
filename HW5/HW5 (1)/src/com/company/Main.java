package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder().setUsername("arash1377") .setName("arash") .setPassword("1234") .setAge(21) .setAddress("Vanak St") .setPhoneNumber("09120000000") .setDegree("diploma");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("\\Users\\arash\\IdeaProjects\\HW5 (1)\\out\\production\\HW5 (1)\\com\\TEST.TXT");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(personBuilder);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("\\Users\\arash\\IdeaProjects\\HW5 (1)\\out\\production\\HW5 (1)\\com\\TEST.TXT");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            PersonBuilder x = (PersonBuilder) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("username: " + x.getUsername());
            System.out.println("name: " + x.getName());
            System.out.println("password: ******");
            System.out.println("age: " + x.getAge());
            System.out.println("address: " + x.getAddress());
            System.out.println("phone number: " + x.getPhoneNumber());
            System.out.println("degree: " + x.getDegree());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
