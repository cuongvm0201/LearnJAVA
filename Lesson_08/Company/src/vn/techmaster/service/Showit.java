package vn.techmaster.service;

import vn.techmaster.allclass.It;

import java.util.ArrayList;


public class Showit {
    public void addIT() {
        ArrayList<It> listIT = new ArrayList<>();
        listIT.add(new It(1, "A", 20, "0912345678", "aaa@gmail.com", 5000000, 20));
        listIT.add(new It(2, "B", 21, "0912345679", "bbb@gmail.com", 5500000, 15));
        listIT.add(new It(3, "C", 22, "0912345624", "ccc@gmail.com", 5200000, 12));
        listIT.add(new It(4, "D", 22, "0914445679", "ddd@gmail.com", 6000000, 13));
        for(It it: listIT){
            System.out.println(it);
        }
    }
}
