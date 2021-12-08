package vn.techmaster.service;

import vn.techmaster.allclass.Verifier;

import java.util.ArrayList;

public class Showverifier {
    public void addVerifier() {
        ArrayList<Verifier> listVerifier = new ArrayList<>();
        listVerifier.add(new Verifier(5, "AA", 25, "0984342444", "aaaa@gmail.com", 8000000, 20));
        listVerifier.add(new Verifier(6, "BB", 28, "0984444444", "bbbb@gmail.com", 9000000, 25));
        listVerifier.add(new Verifier(7, "CC", 30, "0985552444", "cccc@gmail.com", 10000000, 15));
        for(Verifier ve: listVerifier){
            System.out.println(ve);
        }
    }
}
