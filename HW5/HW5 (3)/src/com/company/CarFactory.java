package com.company;


public class CarFactory {
    public static Car getCar(int c) {
        switch (c) {
            case 1:
                return new BMW();
            case 2:
                return new Benz();
            default:
                return null;

        }
    }
}
