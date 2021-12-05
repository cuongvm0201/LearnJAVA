package vn.techmaster.service;
import vn.techmaster.dataFilm.addFilm;
import vn.techmaster.dataFilm.newFilm;

import java.util.ArrayList;
public class showFilm {
    public static void printFilm(){
        ArrayList<newFilm> allFilms = addFilm.getFilm();
        System.out.println("Danh sách phim đang chiếu: ");
        for (newFilm list : allFilms) {
            System.out.println(list + "\n");
        }
        System.out.println("-------------------");


        }
    }
