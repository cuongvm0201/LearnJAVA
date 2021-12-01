package vn.techmaster;

public class Person {
    public String name;
    public int age;
    public String address;
//    public static String school = "Techmaster";
//    public static void changeSchool(){
//        school = "CNTT";
//    }

//    static {
//        System.out.println("Gọi tới khối static");
//    }

    //Tạo Constructor mặc định
//    public Person(){
//        System.out.println("Gọi tới constructor mặc định");
//    }

    //Tạo Constructor có tham số
//    public Person(String ten, int tuoi, String diachi){
//        name = ten;
//        age = tuoi;
//        address = diachi;
//    }


    public Person(String name, int age, String address) { // alt + insert gọi phím tắm
        this.name = name;
        this.age = age;
        this.address = address;
    }
//
//    public void study(){
//        System.out.println(name +" Đi học");
//    }
//
    @Override
    public String toString() {
        return name + " - " + age + " - " +address;
    }

}
