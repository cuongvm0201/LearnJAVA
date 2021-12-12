import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Repository {
    public ArrayList<Film> getData() {
        ArrayList<Film> listFilm = new ArrayList<>();
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("Film.json");
            Type objectType = new TypeToken<ArrayList<Film>>() {
            }.getType();
            listFilm = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return listFilm;
    }
}
