package com.company;

public class BMW implements Car{
    @Override
    public void name() {
        System.out.println("BMW:");
    }

    @Override
    public void HP() {
        System.out.println("    HP: 255");
    }

    @Override
    public void model() {
        System.out.println("    model: 330i");
    }

    @Override
    public void acceleration() {
        System.out.println("    0-100 km/h: 5.6 sec");
    }
}
