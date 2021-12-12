import java.util.*;


public class Service implements IService {

    @Override
    public void printList(ArrayList<Film> listFilm) {
        System.out.println("Danh sách toàn bộ phim: ");
        for (Film f : listFilm) {
            System.out.println(f);
        }
    }

    @Override
    public void sortByName(ArrayList<Film> listFilm) {
        Collections.sort(listFilm, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getMoviename().replaceAll("[-+.^:,]", "").compareTo(o2.getMoviename().replaceAll("[-+.^:,]", ""));
            }
        });
        System.out.println("Danh sách film sau khi sắp xếp theo tên: ");
        for (Film f : listFilm) {
            System.out.println(f);
        }
    }


    @Override
    public void sortByRunTime(ArrayList<Film> listFilm) {
        Collections.sort(listFilm, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getRuntime() - o2.getRuntime();
            }
        });
        System.out.println("Danh sách film sau khi sắp xếp theo thời lượng chiếu: ");
        for (Film f : listFilm) {
            System.out.println(f);
        }
    }

    @Override
    public void sortByView(ArrayList<Film> listFilm) {
        Collections.sort(listFilm, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getView() - o2.getView();
            }
        });
        System.out.println("Danh sách film sau khi sắp xếp theo lượt view: ");
        for (Film f : listFilm) {
            System.out.println(f);
        }
    }


}
