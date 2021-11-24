package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Info {
    public String name;
    public int age;
    public String address;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên: ");
        name = sc.nextLine();
        System.out.println("Nhập Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Địa Chỉ: ");
        address = sc.nextLine();

    }
    public void output(){
        System.out.printf("Tên tôi là %s, Tôi %d tuổi, Tôi đến từ %s\n", name, age, address);
    }

    // Tìm số lớn nhất trong 2 số, 1 số nhập từ bàn phím, 1 số sinh ngẫu nhiên
        public void sosanh (){
        Scanner sc1 = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Nhập số nguyên bất kỳ: ");
        int number1 = Integer.parseInt(sc1.nextLine());
        System.out.println("Số vừa nhập: " + number1);
        int number2 = ran.nextInt(1000);
        System.out.println("Số ngẫu nhiên từ 0-1000 là:" + number2);
        int number3 = Math.max(number1,number2);
        System.out.println("Số lớn nhất trong 3 số là:" + number3);
        }
}
