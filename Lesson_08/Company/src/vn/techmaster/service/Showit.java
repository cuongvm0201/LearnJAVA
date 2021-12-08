package vn.techmaster.service;

import vn.techmaster.model.It;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Showit {
    ArrayList<It> listIT;
    public void addIT() {
        listIT = new ArrayList<>();
        listIT.add(new It(1, "A", 20, "0912345678", "aaa@gmail.com", 5000000, 20));
        listIT.add(new It(2, "B", 21, "0912345679", "bbb@gmail.com", 5500000, 15));
        listIT.add(new It(3, "C", 22, "0912345624", "ccc@gmail.com", 5200000, 12));
        listIT.add(new It(4, "D", 22, "0914445679", "ddd@gmail.com", 6000000, 13));
    }

    public void printIT(){
        for (It it: listIT){
            System.out.println(it);
        }
    }

    public void findIT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên IT muốn tìm kiếm: ");
        String subnameIT = sc.nextLine();
        int count = 0;
        for (int i = 0; i<listIT.size();i++){
            if(listIT.get(i).getName().toLowerCase().contains(subnameIT.toLowerCase())){
                System.out.println(listIT.get(i));
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không có nhân viên IT này trong công ty!");
        }
    }

}
