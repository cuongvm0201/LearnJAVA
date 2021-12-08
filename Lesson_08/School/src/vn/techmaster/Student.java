package vn.techmaster;

import java.util.Scanner;

public class Student extends Person {
    private double theoreticalPoint;
    private double praticePoint;

//    public Student(int id, String name, int age, String address, double theoreticalPoint, double praticePoint) {
//        super(id, name, age, address);
//        this.theoreticalPoint = theoreticalPoint;
//        this.praticePoint = praticePoint;
//    }

    public Student() {
        super();
    }

    public double avgPoint (){
        return (this.praticePoint + this.theoreticalPoint)/2;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Điểm lý thuyết: " + theoreticalPoint + " - " + "Điểm thực hành: " + praticePoint + " - " + "Điểm trung bình: " + avgPoint();
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        super.addPerson();
        System.out.println("Nhập điểm lý thuyểt: ");
        this.theoreticalPoint = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm thực hành: ");
        this.praticePoint = Double.parseDouble(sc.nextLine());
    }
}
