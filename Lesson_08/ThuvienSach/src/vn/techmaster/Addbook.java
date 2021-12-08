package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class Addbook {
    public ArrayList<SchoolBook> addBook(){
        ArrayList<SchoolBook> listBook = new ArrayList<>();
        listBook.add(new SchoolBook("C","CC", LocalDate.now(),300,1000,"CCC",200));
        listBook.add(new SchoolBook("D","DD", LocalDate.now(),500,1500,"DDD",500));
        return listBook;
    }

    public void printBook (ArrayList<SchoolBook> listBook){
        for(SchoolBook school: listBook ){
            System.out.println(school);
        }


    }
}
