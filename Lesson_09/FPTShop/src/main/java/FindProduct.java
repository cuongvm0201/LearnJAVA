import java.util.ArrayList;
import java.util.Scanner;

public class FindProduct {
    public void menuSelect() {
        Scanner sc = new Scanner(System.in);
        Service n = new Service();
        ArrayList<Product> newlistProduct = n.addProduct();
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách toàn bộ sản phẩm: ");
                    n.printProduct(newlistProduct);
                    break;
                case 2:
                    System.out.println("Danh sách các sản phẩm điện thoại: ");
                    for (int i = 0; i < newlistProduct.size(); i++) {
                        for (int j = 0; j < newlistProduct.get(i).getCategory().length; j++) {
                            if (newlistProduct.get(i).getCategory()[j].equals("Điện thoại")) {
                                System.out.println(newlistProduct.get(i));
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách các sản phẩm Apple: ");
                    for (int i = 0; i < newlistProduct.size(); i++) {
                        for (int j = 0; j < newlistProduct.get(i).getCategory().length; j++) {
                            if (newlistProduct.get(i).getCategory()[j].equals("Apple")) {
                                System.out.println(newlistProduct.get(i));
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Danh sách các sản phẩm Laptop: ");
                    for (int i = 0; i < newlistProduct.size(); i++) {
                        for (int j = 0; j < newlistProduct.get(i).getCategory().length; j++) {
                            if (newlistProduct.get(i).getCategory()[j].equals("Laptop")) {
                                System.out.println(newlistProduct.get(i));
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Danh sách các sản phẩm Phụ kiện: ");
                    for (int i = 0; i < newlistProduct.size(); i++) {
                        for (int j = 0; j < newlistProduct.get(i).getCategory().length; j++) {
                            if (newlistProduct.get(i).getCategory()[j].equals("Phụ kiện")) {
                                System.out.println(newlistProduct.get(i));
                            }
                        }
                    }
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
        System.out.println("1 - Hiển thi toàn bộ sản phẩm");
        System.out.println("2 - Hiển thị sản phẩm Điện Thoại");
        System.out.println("3 - Hiển thị sản phẩm Apple");
        System.out.println("4 - Hiển thị sản phẩm Laptop");
        System.out.println("5 - Hiển thị sản phẩm Phụ Kiện");
        System.out.println("0 - Thoát");
    }
}
