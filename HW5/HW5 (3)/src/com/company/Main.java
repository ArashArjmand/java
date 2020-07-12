package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new CarFactory().getCar(Car.BMW);
        car1.name();
        car1.model();
        car1.HP();
        car1.acceleration();

        Car car2 = new CarFactory().getCar(Car.Benz);
        car2.name();
        car2.model();
        car2.HP();
        car2.acceleration();

    }
}
