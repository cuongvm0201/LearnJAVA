package vn.techmaster;

public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void setArea() {
        System.out.println("Diện tích hình tròn: " + Math.PI * (r*r));
    }

    @Override
    public void setPerimeter() {
        System.out.println("Chu vi hình tròn: " + Math.PI * 2 * r);
    }
}
