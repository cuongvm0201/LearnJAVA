package AllService;

import Model.Film;
import Model.Repository;

import java.util.*;


public class Service implements IService {
    Repository repository = new Repository();
    ArrayList<Film> listFilm = repository.getData();
    @Override
    public void printList(ArrayList<Film> listFilm) {
        Collections.sort(listFilm, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getId() - o2.getId();
            }
        });
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
                return o1.getTitle().replaceAll("[-+.^:,]", "").compareTo(o2.getTitle().replaceAll("[-+.^:,]", ""));
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
                return o1.getPublishingYear() - o2.getPublishingYear();
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
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        System.out.println("Danh sách film sau khi sắp xếp theo lượt view: ");
        for (Film f : listFilm) {
            System.out.println(f);
        }
    }

    public Map<String [], Integer> countByType (ArrayList<Film> listFilm){
        Map<String [], Integer> typeMap = new HashMap<>();

        for (Film p: listFilm){
            String [] type = p.getCategory();
            if(typeMap.get(type) == null){
                typeMap.put(type, 1);
            } else {
                typeMap.put(type, typeMap.get(type) + 1);
            }
        }
        return typeMap;
    }

}
