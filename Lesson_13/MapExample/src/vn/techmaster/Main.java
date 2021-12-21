package vn.techmaster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<Integer, String> maps = new HashMap<>();
//        maps.put(4, "Java");
//        maps.put(1, "HTML");
//        maps.put(7, "Ruby");
//        maps.put(3, "PHP");
//
//        System.out.println(maps);
//        maps.put(4, "Python");
//        System.out.println(maps);
//
//        for (Map.Entry<Integer, String> entry : maps.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        System.out.println("--------------------------------");
//
//        Map<Integer, String> newMap = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        newMap.put(4, "Java");
//        newMap.put(1, "HTML");
//        newMap.put(7, "Ruby");
//        newMap.put(3, "PHP");
//        for (Map.Entry<Integer, String> entry : newMap.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        Service service = new Service();
        ArrayList<Person> persons = service.getAllPerson();
        System.out.println("Danh sách ban đầu: ");
        service.printList(persons);

        Map<Gender, Integer> countGender = service.countByGender(persons);
        for (Map.Entry<Gender, Integer> entry : countGender.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
