package vn.techmaster;

public class Student {
    public int iD;
    public String name;
    public double point1;
    public double point2;
    public static String school = "Techmaster";

    public double point3(){
        return (point1+point2)/2;
    }

    public Student(int iD, String name, double point1, double point2) {
        this.iD = iD;
        this.name = name;
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "ID: " + iD + "\n" + "Tên:" + name + "\n" + "Điểm Lý Thuyết: " + point1 + "\n" +
                "Điểm Thực Hành: " + point2 + "\n" + "Trường học: " + school + "\n" + "Điểm Trung Bình: "+ point3();
    }
}
