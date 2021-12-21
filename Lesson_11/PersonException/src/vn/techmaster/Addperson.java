package vn.techmaster;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Addperson {

    public static ArrayList<Person> insertPerson (){
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> listPerson = new ArrayList<>();
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = inputEmail();
        System.out.println("Nhập SĐT: ");
        String mobile = inputMobile();
        System.out.println("Nhập lương: ");
        long salary = Validate.validateSalary();
        Person newperson = 
    }

    public static String inputEmail(){
        Scanner sc = new Scanner(System.in);
        String email = "";
        while (!Validate.validateEmail(email)){
            System.out.println("Email: ");
            email = sc.nextLine();
        }
        return email;
    }

    public static String inputMobile(){
        Scanner sc = new Scanner(System.in);
        String mobile = "";
        while (!Validate.validateMobile(mobile)){
            System.out.println("Mobile: ");
            mobile = sc.nextLine();
        }
        return mobile;
    }
}