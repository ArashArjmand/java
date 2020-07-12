package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
