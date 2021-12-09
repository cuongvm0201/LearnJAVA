package vn.techmaster;

public class Square extends Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Vẽ hình vuông");
    }
    @Override
    public void setArea(){
        System.out.println("Diện tích hình vuông: " + a*a);
    }

    @Override
    public void setPerimeter() {
        System.out.println("Chu vi hình vuông: " + 4*a);
    }
}
