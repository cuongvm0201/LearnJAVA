

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Service {
    public ArrayList<Person> getData (){
        ArrayList<Person> listPerson = new ArrayList<>();

        //tạo đối tượng gson
        Gson gson = new Gson();

        //đọc file
        try {
            FileReader reader = new FileReader("person.json");
            //lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Person>>(){}.getType();
            listPerson = gson.fromJson(reader, objectType);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return listPerson;
    }

    public void printList (ArrayList<Person> listPerson){
        for (Person p: listPerson){
            System.out.println(p);
        }
    }

    @Override
    public void sortByName(ArrayList<Person> list) {

    }

    @Override
    public void sortByEmail(ArrayList<Person> list) {

    }

}
