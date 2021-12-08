package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Mã: " +
                id +  " - " +
                "Tên: " + name + " - " +
                "Tuổi: " + age + " - " +
                "Địa chỉ: " + address;
    }

    public void addPerson (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
    }
}
