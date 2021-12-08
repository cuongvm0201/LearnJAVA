package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
        Student s = new Student();
        s.addPerson();
        listStudent.add(s);
        }
        for (Student t: listStudent){
        System.out.println(t);
        }

        ArrayList<Teacher> listTeacher = new ArrayList<>();
        System.out.println("Nhập số lượng giáo viên: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++)
        {
            Teacher s = new Teacher();
            s.addPerson();
            listTeacher.add(s);
        }
        for (Teacher te: listTeacher){
            System.out.println(te);
        }

    }
}
