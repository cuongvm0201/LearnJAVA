package vn.techmaster;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Cường", LocalDate.of(1992, 1, 2), "HN", 8.8);
        System.out.println(s);
        Teacher t = new Teacher("Thái", LocalDate.of(1995, 12, 25), "HCM", 0);
        System.out.println(t);
    }
}
