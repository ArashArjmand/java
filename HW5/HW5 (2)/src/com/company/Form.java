package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Form {

    private static Form form = new Form();
    public static Form getInstance() {return form;}
    private Form() {}

    public void show() {
        try {
            FileInputStream fileInputStream = new FileInputStream("\\Users\\arash\\IdeaProjects\\HW5 (2)\\out\\production\\HW5 (2)\\com\\TEST.TXT");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person x = (Person) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("name: " + x.getName());
            System.out.println("ID: " + x.getID());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
