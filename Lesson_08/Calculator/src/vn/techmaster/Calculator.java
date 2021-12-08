package vn.techmaster;

public class Calculator {
    public void sum(int x, int y) {
        System.out.printf("%d + %d = %d",x, y, (x+y));
    }

    public void sum(int x, int y, int z) {
        System.out.printf("%d + %d + %d= %d",x, y,z, (x+y+z));
    }
    public void sum(double x, double y) {
        System.out.printf("%.2f + %.2f = %.2f",x, y, (x+y));
    }
}
