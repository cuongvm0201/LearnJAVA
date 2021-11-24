package vn.techmaster;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Scanner sc = new Scanner(System.in);
        Info info = new Info();
        info.input();
        info.output();

        info.sosanh();

        /*System.out.println("Nhập số nguyên bất kỳ: ");
        int number = Integer.valueOf(sc.nextLine());

        System.out.println("Số vừa nhập: " + number);

        System.out.println("Nhập số thực: ");
        //double number2 = sc.nextDouble();
        double number2 = Double.valueOf(sc.nextLine());
        System.out.println("Số vừa nhập: " + number2);*/

        // sau khi nhập số bị trôi lệnh, cần xử lý trôi lệnh
        //sc.nextLine();
        /*System.out.println("Vui lòng nhập tên bạn: ");
        String name = sc.nextLine(); // sc.next() chỉ nhận text trước khoảng trống
        System.out.println("Tên của bạn: " + name);*/

        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên bạn: ");
        String name = sc1.nextLine();
        System.out.println("Vui lòng nhập tuổi: ");
        int tuoi = Integer.parseInt(sc1.nextLine());
        System.out.println("Vui lòng nhập địa chỉ: ");
        String address = sc1.nextLine();

        System.out.println("Tên của bạn: " + name);
        System.out.println("Tuổi của bạn: " + tuoi);
        System.out.println("Địa chỉ: " + address);
        sc.close();*/
        //System.out.println("Nhập tên: ");
        //String name = sc.nextLine();
        //System.out.print("Xin chào các bạn. ");
        //System.out.print("Tôi tên là:" +name);

        // System.out.printf("Tôi tên là %s",name);
        /*String name = "Ngọc";
        int age = 30;
        String address = "Hà Nội";
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s\n", name, age, address);
        double weight = 55.5;
        System.out.printf("Cân nặng của tôi là %.1f\n", weight); */

        /*double height = 1.66;
        double bmi = weight/(Math.pow(height,2));
        System.out.printf("Chỉ số BMI của bạn là %.2f\n ",bmi);
        System.out.println("Chỉ số BMI làm tròn lên: " + Math.ceil(bmi));
        System.out.println("Chỉ số BMI làm tròn xuống: " + Math.floor(bmi));*/

        /*Random ran = new Random();
        int randomNumber = ran.nextInt(99);
        System.out.println("Số ngẫu nhiên từ 0-99 là: " + randomNumber);
        int number = ran.nextInt(20)+10;
        System.out.println("Số ngẫu nhiên từ 10-20 là:" + number);*/

        // Tìm số lớn nhất trong 2 số, 1 số nhập từ bàn phím, 1 số sinh ngẫu nhiên
        /*System.out.println("Nhập số nguyên bất kỳ: ");
        int number1 = Integer.valueOf(sc.nextLine());
        System.out.println("Số vừa nhập: " + number1);
        int number2 = ran.nextInt(1000);
        System.out.println("Số ngẫu nhiên từ 0-1000 là:" + number2);
        int number3 = Math.max(number1,number2);
        System.out.println("Số lớn nhất trong 2 số là:" + number3);
        sc.close();*/

        /*int number4 = ran.nextInt(20);
        String rs = (number4 %2 == 0) ? number4 +" Là số chẵn": number4 +" Là số lẻ";
        System.out.println("Số ngẫu nhiên là:" + number4);
        System.out.println("Kết quả là: " + rs);*/


    }

}
