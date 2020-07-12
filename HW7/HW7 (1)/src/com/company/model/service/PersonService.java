package com.company.model.service;

import com.company.model.entity.PersonEntity;
import com.company.model.repository.PersonRepository;

import java.util.Scanner;

public class PersonService {
    Scanner scanner = new Scanner(System.in);
    private static PersonService ourInstance = new PersonService();
    public static PersonService getInstance() { return  ourInstance; }
    private PersonService(){}

    public void save(PersonEntity entity) throws Exception{
        PersonRepository repository = new PersonRepository();
        repository.insert(entity);
        repository.commit();
    }

    public void edit(PersonEntity entity) throws Exception{
        PersonRepository repository = new PersonRepository();
        System.out.println("choose:");
        System.out.println("1. 2gb = 1000t");
        System.out.println("2. 4gb = 2000t");
        System.out.println("3. 10gb = 5000t");
        System.out.println("4. 25gb = 10000t");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                entity.setData(2);
                entity.setMoney(1000);
                System.out.println("successful");
                repository.update(entity);
                repository.commit();
                break;
            case 2:
                entity.setData(4);
                entity.setMoney(2000);
                System.out.println("successful");
                repository.update(entity);
                repository.commit();
                break;
            case 3:
                entity.setData(10);
                entity.setMoney(5000);
                System.out.println("successful");
                repository.update(entity);
                repository.commit();
                break;
            case 4:
                entity.setData(25);
                entity.setMoney(10000);
                System.out.println("successful");
                repository.update(entity);
                repository.commit();
                break;
        }

    }
}
