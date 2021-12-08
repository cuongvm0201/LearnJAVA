package vn.techmaster;

import java.util.Scanner;

public class Teacher extends Person {
    private long salary;

    public Teacher(int id, String name, int age, String address, long salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public Teacher() {
        super();
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Mức lương: " + salary + " - " + "Dạy môn: " + subject() ;
    }

    public String subject (){
        String subject1 = "Toán Học";
        String subject2 = "Hóa Học";
        String subject3 = "Vật Lý";
        if (this.salary < 20000000){
            return subject2;
        }
        if (this.salary >= 20000000 && this.salary < 30000000){
            return subject1;
        } else {
            return subject3;
        }
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        super.addPerson();
        System.out.println("Nhập lương: ");
        this.salary = Long.parseLong(sc.nextLine());
    }
}
