package vn.techmaster.service;

import vn.techmaster.model.Verifier;

import java.util.ArrayList;
import java.util.Scanner;

public class Showverifier {
    ArrayList<Verifier> listVerifier;
    public void addVerifier() {
        listVerifier = new ArrayList<>();
        listVerifier.add(new Verifier(5, "AA", 25, "0984342444", "aaaa@gmail.com", 8000000, 20));
        listVerifier.add(new Verifier(6, "BB", 28, "0984444444", "bbbb@gmail.com", 9000000, 25));
        listVerifier.add(new Verifier(7, "CC", 30, "0985552444", "cccc@gmail.com", 10000000, 15));
    }

    public void printVerifier(){
        for(Verifier ve: listVerifier){
            System.out.println(ve);
        }
    }

    public void findVerifier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Kiểm chứng muốn tìm kiếm: ");
        String subnameIT = sc.nextLine();
        int count = 0;
        for (int i = 0; i<listVerifier.size();i++){
            if(listVerifier.get(i).getName().toLowerCase().contains(subnameIT.toLowerCase())){
                System.out.println(listVerifier.get(i));
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không có nhân viên kiểm chứng này trong công ty!");
        }
    }
}
