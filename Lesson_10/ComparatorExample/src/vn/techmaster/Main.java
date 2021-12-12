package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        //Sắp xếp theo tên
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sắp xếp theo tên với Comparator");
        show(listPerson);

        //Sắp xếp theo tuổi
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("Danh sách sắp xếp theo tuổi với Comparator");
        show(listPerson);

    }
    public static void show(ArrayList<Person> listPerson){
        for (Person p: listPerson){
            System.out.println(p);
        }
    }
}
