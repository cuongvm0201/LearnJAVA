package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Thái",22,"Hà Nội"));
        listPerson.add(new Person("Khải",22,"Hà Nam"));
        listPerson.add(new Person("Cường",22,"Hà Giang"));
        listPerson.add(new Person("Tuấn",23,"Hà Tĩnh"));
        listPerson.add(new Person("Tuấn Anh",24,"Hồ Chí Minh"));

        System.out.println("Danh sách ban đầu");
        show(listPerson);

        Collections.sort(listPerson);
        System.out.println("Danh sách sau khi sắp xếp: ");
        show(listPerson);
    }

    public static void show(ArrayList<Person> listPerson){
        for (Person p: listPerson){
            System.out.println(p);
        }
    }
}
