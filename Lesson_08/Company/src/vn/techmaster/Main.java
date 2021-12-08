package vn.techmaster;

import vn.techmaster.service.Showit;
import vn.techmaster.service.Showverifier;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Showit n = new Showit();
        Showverifier m = new Showverifier();
        Scanner sc = new Scanner(System.in);

        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách toàn bộ nhân viên: ");
                    n.addIT();
                    m.addVerifier();
                    break;
                case 2:
                    System.out.println("Danh sách các nhân viên IT: ");
                    n.addIT();
                    break;
                case 3:
                    System.out.println("Danh sách các nhân viên kiểm chứng: ");
                    m.addVerifier();
                    break;
                case 0:
                    isCheck = true;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại!");
            }

        }
    }

    public static void menu() {
        System.out.println("Lựa chọn theo menu sau: ");
        System.out.println("1 - Hiển thi toàn bộ nhân viên");
        System.out.println("2 - Hiển thị danh sách nhân viên IT");
        System.out.println("3 - Hiển thi danh sách nhân viên Kiểm chứng");
        System.out.println("0 - Thoát");
    }
}

