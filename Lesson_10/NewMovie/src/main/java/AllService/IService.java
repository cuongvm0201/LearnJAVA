package AllService;

import Model.Film;

import java.util.ArrayList;

public interface IService {
    public void printList(ArrayList<Film> listFilm);

    public void sortByName(ArrayList<Film> listFilm);

    public void sortByRunTime(ArrayList<Film> listFilm);

    public void sortByView(ArrayList<Film> listFilm);


}
