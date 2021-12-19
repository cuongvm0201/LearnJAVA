package vn.techmaster.Controller;


import vn.techmaster.AllService.Service;

import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.printWaiter();
                    break;
                case 2:
                    service.printKitchen();
                    break;
                case 3:
                    service.printAll();
                    break;
                case 0:
                    isCheck = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem danh sách nhân viên bàn");
        System.out.println("2 - Xem danh sách nhân viên bếp");
        System.out.println("3 - Xem tất cả danh sách nhân viên");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}