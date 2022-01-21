package controller;

import database.ConnectJDBC;
import model.ActorFilm;
import model.Film;
import service.FilmService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    FilmService service = new FilmService();
    ConnectJDBC connectJDBC = new ConnectJDBC();
    Connection conn = connectJDBC.connect();
    ArrayList<Film> films;
    ArrayList<ActorFilm> actorFilms;
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.getFilmByRating(conn);
                    break;
                case 2:
                    service.getActorByFilm(conn);
                    break;
                case 3:
                    System.out.println("Nhập tên phim muốn tìm: ");
                    String newTitle = sc.nextLine();
                    service.findTitleFilm(conn, newTitle);
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
        System.out.println("1 - Lấy ra thông tin các phim gồm: title, description, release_year, length, rating, category của các phim có rating là PG");
        System.out.println("2 - Lấy ra title, first_name và last_name actor của các bộ phim có chứa từ ACADEMY");
        System.out.println("3 - Tìm phim theo title, với title nhập từ bàn phím");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }


}
