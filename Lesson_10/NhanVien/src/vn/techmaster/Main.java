package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        FullTimeEmployee fu = new FullTimeEmployee("thái",500000);
        System.out.println(fu);
        PartTimeEmployee pa = new PartTimeEmployee("khải",501000);
        System.out.println(pa);
    }
}
