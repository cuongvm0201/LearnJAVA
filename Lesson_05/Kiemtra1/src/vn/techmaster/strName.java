package vn.techmaster;

import java.util.Locale;
import java.util.Scanner;

public class strName {
    public static void questFive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name = sc.nextLine();
        name.trim();
        name = name.replaceAll("//s+", " "); // thay thế nhiều khoảng trắng thành 1 khoảng trắng
        String[] strArray = name.split(" ");
        String result = "";
        for (int i = 0; i < strArray.length; i++) {
            result += String.valueOf(strArray[i].charAt(0)).toUpperCase() + strArray[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(result);

    }
}