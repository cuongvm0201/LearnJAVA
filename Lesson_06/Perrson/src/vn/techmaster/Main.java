package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Person cuong = new Person();
//        cuong.name = "Cường";
//        cuong.age = 30;
//        cuong.address = "Hà Nội";
//        System.out.println(cuong.toString());
//        cuong.study();
//
//        Person thai = new Person();
//        thai.name = "Thái";
//        thai.age = 20;
//        thai.address = "Hà Nội";
//        System.out.println(thai);
//        thai.study();
//
//        Person trang = new Person("Trang",22,"HN");
//        System.out.println(trang + Person.school);
//        trang.study();
//        System.out.println("----------------------");
//        System.out.println("List Dog:");
//
//
//
//        Animal dogOne = new Animal ("Neapolitan Mastiff","Large","5 Years","Black");
//        System.out.println(dogOne);
//        System.out.println("----------------------");
//        Animal dogTwo = new Animal ("Maltese","Small","2 Years","White");
//        System.out.println(dogTwo);
//        System.out.println("----------------------");
//        Animal dogThree = new Animal ("Chow Chow","Midium","3 Years","Brown");
//        System.out.println(dogThree);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số học sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        Person listPerson[]= new Person[n];
        for (int i = 0; i < n ; i++){
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập địa chỉ: ");
            String address = sc.nextLine();

            Person p = new Person(name, age, address);// Tạo đối tượng mới
            listPerson[i] = p; // gán đối tượng mới cho mảng ở vị trí i
        }
        for (int i = 0; i < n ; i++){
            System.out.println(listPerson[i]);
        }
    }
}
