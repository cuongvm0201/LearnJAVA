package vn.techmaster;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person("Cường", 30,"HÀ NỘI");
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//        p.setName("Mạnh Cường");
//        p.setAge(50);
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//        ArrayList<String> list = new ArrayList<>();
//        list.add("HTML/CSS");
//        list.add("JS");
//        list.add("Database");
//        list.add("Spring boot");
//
//        System.out.println(list);
//        printList(list);
//        list.add(1,"Java");
//        System.out.println("Danh sách sau khi chèn: ");
//        printList(list);
//
//        list.set(1, "Java Core");
//        System.out.println("Danh sách sau khi sửa: ");
//        printList(list);
//
//        list.remove("Database");
//        System.out.println("Danh sách sau khi xóa lần 1: ");
//        printList(list);
//
//        list.remove(1);
//        System.out.println("Danh sách sau khi xóa lần 2: ");
//        printList(list);
//        System.out.println("Kích thước: " + list.size());
//        list.clear();
//        System.out.println("Kích thước sau khi xóa toàn bộ: " + list.size());

        ArrayList<Person> listPerson = new ArrayList<>();
        Person p = new Person("Cường", 25, "HN");
        listPerson.add(p);
        listPerson.add(new Person("Linh",20,"HN"));
        listPerson.add(new Person("Hoàng",23,"HN"));
        listPerson.add(new Person("Tuấn",20,"HN"));

        for (Person person: listPerson){
            System.out.println(person);
        }
        System.out.println("Danh sách người 20 tuổi: ");
        for (int i=0; i < listPerson.size();i++){
            if(listPerson.get(i).getAge() == 20){
                System.out.println(listPerson.get(i));
            }
        }
    }
//    public static void printList(ArrayList<String> list){
//        for (String str : list){
//            System.out.println(str);
//        }
//    }
}
