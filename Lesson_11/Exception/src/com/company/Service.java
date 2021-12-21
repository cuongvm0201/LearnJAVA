package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public void printList(ArrayList<Person> listPerson){
        for (Person p: listPerson){
            System.out.println(p);
        }
    }

    public void insertPerson(ArrayList<Person> listPerson){
        System.out.println("Vui lòng nhập thông tin:");
        String id = CheckINPUT.inputNewID();
        String name = CheckINPUT.inputName();
        String email = CheckINPUT.inputEmail();
        String mobile = CheckINPUT.inputMobile();
        long salary = CheckINPUT.inputSalary();
        Person newPerson = new Person(id, name, email, mobile, salary);
        listPerson.add(newPerson);
        System.out.println("Thêm thành công");
    }


}
