package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Addlist n = new Addlist();
        n.addLibrary();
        ArrayList<Library> list = n.addLibrary();
        n.printLibrary(list);

        Addbook m = new Addbook();
        m.addBook();
        ArrayList<SchoolBook> list1 = m.addBook();
        m.printBook(list1);

    }
}
