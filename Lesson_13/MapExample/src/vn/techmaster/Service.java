package vn.techmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Service {

    public ArrayList<Person> getAllPerson (){
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("Thái", Gender.MALE));
        person.add(new Person("Khải", Gender.MALE));
        person.add(new Person("Hương", Gender.FEMALE));
        person.add(new Person("Trang", Gender.FEMALE));

        return person;
    }

    public void printList (ArrayList<Person> list){
        for (Person p: list){
            System.out.println(p);
        }
    }

    public Map<Gender, Integer> countByGender (ArrayList<Person> list){
        Map<Gender, Integer> genderMap = new HashMap<>();

        for (Person p: list){
            Gender gender = p.getGender();
            if(genderMap.get(gender) == null){
                genderMap.put(gender, 1);
            } else {
                genderMap.put(gender, genderMap.get(gender) + 1);
            }
        }
        return genderMap;
    }
}
