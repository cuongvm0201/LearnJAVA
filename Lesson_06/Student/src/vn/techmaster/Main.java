package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số học sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student listStudent[] = new Student[n];

        for (int i = 0; i < n ; i++){
            System.out.print("Nhập ID: ");
            int iD = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập diểm lý thuyết: ");
            double point1 = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập diểm thực hành: ");
            double point2 = Double.parseDouble(sc.nextLine());

            Student s = new Student(iD, name, point1, point2);// Tạo đối tượng mới
            listStudent[i] = s; // gán đối tượng mới cho mảng ở vị trí i
        }
        for (int i = 0; i < n ; i++){
            System.out.println("Học sinh: " + (i+1) + "\n" + listStudent[i]);
        }
    }
}
