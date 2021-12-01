package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng ô tô: ");
        int n = sc.nextInt();
        sc.nextLine();
        Car listCar[] = new Car[n];
        for (int i = 0; i < n ; i++){
            System.out.print("Nhập Model: ");
            String model = sc.nextLine();
            System.out.print("Nhập Màu: ");
            String color = sc.nextLine();
            System.out.print("Nhập Brand: ");
            String brand = sc.nextLine();


            Car c = new Car(model, color, brand);// Tạo đối tượng mới
            listCar[i] = c; // gán đối tượng mới cho mảng ở vị trí i
        }
        for (int i = 0; i < n ; i++){
            System.out.println(listCar[i]);
        }
    }
}
