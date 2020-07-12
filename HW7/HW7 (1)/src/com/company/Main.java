package com.company;

import com.company.model.entity.PersonEntity;
import com.company.model.service.PersonService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose: 1.create new account 2.login");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Enter Username:");
                String username = scanner.next();
                System.out.println("Enter Password:");
                String password = scanner.next();

                try {
                    PersonService.getInstance().save(new PersonEntity().setUsername(username).setPassword(password));
                } catch (Exception e){
                    e.getMessage();
                }
                break;
            case 2:
                System.out.println("Enter Username:");
                String username1 = scanner.next();
                System.out.println("Enter Password:");
                String password1 = scanner.next();

                try {
                    PersonService.getInstance().edit(new PersonEntity().setUsername(username1).setPassword(password1));
                } catch (Exception e){
                    e.getMessage();
                }
                break;
        }



    }
}
