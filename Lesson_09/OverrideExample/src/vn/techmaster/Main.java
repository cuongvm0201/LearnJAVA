package vn.techmaster;

public class Main {

    public static void main(String[] args) {
//        Square sq = new Square();
//        sq.draw();
//
//        Shape s1 = new Square();
//        s1.draw();
//
//        Shape s2 = new Square();
//        Square s3 = (Square) s2; //ép kiểu

        Circle c = new Circle( 4);
        c.setArea();
        c.setPerimeter();

        Square s = new Square(5);
        s.setArea();
        s.setPerimeter();

    }
}
