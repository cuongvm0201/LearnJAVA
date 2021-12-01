package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();
        Goods listGoods[] = new Goods[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập ID sản phẩm: ");
            int idNumber = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.print("Nhập thông tin sản phẩm: ");
            String content = sc.nextLine();
            System.out.print("Nhập số lượng: ");
            int quanlity = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá bán: ");
            int price = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập loại sản phẩm: ");
            String type = sc.nextLine();

            Goods g = new Goods(idNumber, name, content, quanlity, price, type);
            listGoods[i] = g;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm " + (i + 1) + "\n" + listGoods[i] + "\n" + "---------------");
        }

        System.out.println("Nhập tên bạn sản phẩm muốn tìm kiếm: ");
        String findItem = sc.nextLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (listGoods[i].name.contains(findItem)) {
                System.out.println("Sản phẩm bạn tìm:" + "\n" + listGoods[i] + "\n" + "---------------");
                count++;
            }
        }

        while (count == 0) {
            System.out.println("Sản phẩm bạn tìm kiếm không tồn tại, vui lòng nhập lại:");
            String refindItem = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (listGoods[i].name.contains(refindItem)) {
                    System.out.println("Sản phẩm bạn tìm:" + "\n" + listGoods[i] + "\n" + "---------------");
                    count++;
                }
            }
        }
        sc.close();
    }
}
