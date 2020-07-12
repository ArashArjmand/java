package com.company;

public class Benz implements Car {
    @Override
    public void name() {
        System.out.println("Benz:");
    }

    @Override
    public void HP() {
        System.out.println("    HP: 255");
    }

    @Override
    public void model() {
        System.out.println("    model: E 350 Sedan");
    }

    @Override
    public void acceleration() {
        System.out.println("    0-100 km/h: 5.8 sec");
    }
}
