package vn.techmaster.service;
import vn.techmaster.dataFilm.addFilm;
import vn.techmaster.dataFilm.newFilm;

import java.util.ArrayList;

public class findFilm {
    public static void searchTypeFilm (){
        ArrayList<newFilm> allFilms = addFilm.getFilm();
        System.out.println("Danh sách phim thuộc thể loại hành động: ");
        for (int i = 0; i < allFilms.size();i++) {
            if (allFilms.get(i).getTypeFilm().toLowerCase().contains("action")){
                System.out.println(allFilms.get(i));
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("Danh sách phim thời lượng chiều ít hơn 100 phút: ");
        for (int i = 0; i < allFilms.size();i++) {
            if (allFilms.get(i).getRunTime() < 100 ){
                System.out.println(allFilms.get(i));
            }
        }
    }
}
