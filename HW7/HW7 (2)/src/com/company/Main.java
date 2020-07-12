package com.company;

import com.company.model.entity.SaipaEntity;
import com.company.model.service.SaipaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("id:");
            int id = scanner.nextInt();
            System.out.println("name:");
            String name = scanner.next();
            System.out.println("color:");
            String color = scanner.next();
            System.out.println("price:");
            int price = scanner.nextInt();
            SaipaService.getInstance().save(new SaipaEntity().setId(id).setName(name).setColor(color).setPrice(price));
            System.out.println("khodro ba moafaghiat sabt shod.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
