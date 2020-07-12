package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("arash", "1");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("\\Users\\arash\\IdeaProjects\\HW5 (2)\\out\\production\\HW5 (2)\\com\\TEST.TXT");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Form.getInstance().show();
    }
}
