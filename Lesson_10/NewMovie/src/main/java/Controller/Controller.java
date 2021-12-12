package Controller;

import AllService.Service;
import Model.Film;
import Model.Repository;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Repository repo = new Repository();
    ArrayList<Film> listFilm = repo.getData();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.printList(listFilm);
                    break;
                case 2:
                    service.sortByName(listFilm);
                    break;
                case 3:
                    service.sortByRunTime(listFilm);
                    break;
                case 4:
                    service.sortByView(listFilm);
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
        System.out.println("1 - Xem toàn bộ danh sách phim");
        System.out.println("2 - Sắp xếp phim theo tên");
        System.out.println("3 - Sắp xếp phim theo thời lượng chiếu");
        System.out.println("4 - Sắp xếp phim theo lượt view");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
