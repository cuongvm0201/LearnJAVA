package vn.techmaster;

import java.util.Locale;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);

    public void insertGoods() {
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
            long price = Long.parseLong(sc.nextLine());
            System.out.print("Nhập loại sản phẩm: ");
            String type = sc.nextLine();

            Goods g = new Goods(idNumber, name, content, quanlity, price, type);
            listGoods[i] = g;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm " + (i + 1) + "\n" + listGoods[i] + "\n" + "---------------");
        }
        int count = 0;
        while (count == 0) {
            System.out.println("Nhập tên bạn sản phẩm muốn tìm kiếm: ");
            String findItem = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if (listGoods[i].name.toLowerCase().contains(findItem)) {
                    System.out.println("Sản phẩm bạn tìm:" + "\n" + listGoods[i] + "\n" + "---------------");
                    count++;
                }
            }
            if (count > 0) {
                break;
            } else {
                System.out.println("Sản phẩm bạn tìm kiếm không tồn tại");
            }
        }
        sc.close();
    }
}
