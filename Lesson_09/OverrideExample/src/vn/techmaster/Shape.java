package vn.techmaster;

public abstract class Shape {
    public void draw(){
        System.out.println("Vẽ hình");
    }

    public final void getName(){
        System.out.println("Name");
    }

    public abstract void setArea();
    public abstract void setPerimeter();
}
