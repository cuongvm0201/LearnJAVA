package com.company;

import java.util.Scanner;

public class CheckINPUT {
    public static String inputNewID (){
        Scanner sc = new Scanner(System.in);
        String id = "";
        System.out.println("Nhập ID: ");
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                id = sc.nextLine();
                if (id.trim().isEmpty()) throw new MyException1("ID không được để trống");
                isCheck = true;
            } catch (MyException1 e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return id;
    }

    public static String inputName (){
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Nhập tên: ");
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                name = sc.nextLine();
                if (name.trim().isEmpty()) throw new MyException1("Tên không được để trống");
                isCheck = true;
            } catch (MyException1 e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return name;
    }

    public static String inputEmail(){
        Scanner sc = new Scanner(System.in);
        String email = "";
        System.out.println("Nhập Email: ");
        Boolean isCheck = false;
        while (!isCheck){
            try{
                email = sc.nextLine();
                if(!Validate.validateEmail(email)) throw new MyException1("Email sai định dạng");
                isCheck = true;
            } catch (MyException1 e){
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return email;
    }

    public static String inputMobile(){
        Scanner sc = new Scanner(System.in);
        String mobile = "";
        System.out.println("Nhập SĐT: ");
        Boolean isCheck = false;
        while (!isCheck){
        try{
            mobile = sc.nextLine();
            if(!Validate.validateMobile(mobile)) throw new MyException1("SĐT phải đủ 10 hoặc 11 số");
            isCheck = true;
        } catch (MyException1 e){
            System.out.println(e.getMessage() + ", vui lòng nhập lại");
        } catch (NumberFormatException e){
            System.out.println("Không được nhập chữ, vui lòng nhập lại");
        }
        }
        return mobile;
    }

    public static long inputSalary (){
        Scanner sc = new Scanner(System.in);
        long salary = 0;
        System.out.println("Nhập lương: ");
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                salary = Long.parseLong(sc.nextLine());
                if (salary <= 0) throw new MyException1("Số nhập vào phải là số dương nhé bạn êi");
                isCheck = true;
            } catch (MyException1 e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e){
                System.out.println("Chỉ nhập được số, vui lòng nhập lại");
            }
        }
        return salary;
    }
}
