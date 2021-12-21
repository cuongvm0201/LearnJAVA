package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    Service se = new Service();

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> listPerson = Model.getData();
        boolean isContinue = false;
        while(!isContinue){
            Menu();
            System.out.print("Lựa chọn của bạn là: "+ "\n");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Danh sách: ");
                    se.printList(listPerson);
                    break;
                case 2:
                    System.out.println("Thêm mới: ");
                    se.insertPerson(listPerson);
                    System.out.println("Danh sách sau khi thêm: ");
                    se.printList(listPerson);
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng chọn lại.");
            }

        }
    }

        public static void Menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem thông tin khách hàng");
        System.out.println("2 - Thêm khách hàng mới");
        System.out.println("0 - Thoát chương trình");

    }
}