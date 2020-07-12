package com.company.model.entity;

public class SaipaEntity {
    private int id;
    private String name;
    private String color;
    private int price;

    public int getId() {
        return id;
    }

    public SaipaEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SaipaEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public SaipaEntity setColor(String color) {
        this.color = color;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SaipaEntity setPrice(int price) {
        this.price = price;
        return this;
    }
}
