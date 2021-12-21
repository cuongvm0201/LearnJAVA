package com.company;

import java.util.ArrayList;

public class Model {
    public static ArrayList<Person> getData (){
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("a","Cường","vmcuong2192@gmail.com", "0945940246",10000000));
        listPerson.add(new Person("b","Cường1","vmcuong2193@gmail.com", "0945944444",11000000));
        return listPerson;
    }
}
