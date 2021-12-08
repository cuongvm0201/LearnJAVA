package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class Addlist {
    public ArrayList<Library> addLibrary (){
        ArrayList<Library> listLibrary = new ArrayList<>();
        listLibrary.add(new Library("A","AA", LocalDate.now(),100));
        listLibrary.add(new Library("B","BB", LocalDate.now(),111));
        return listLibrary;
    }

    public void printLibrary (ArrayList<Library> listLibrary){
        for (Library a: listLibrary){
            System.out.println(a);
        }
    }
}
