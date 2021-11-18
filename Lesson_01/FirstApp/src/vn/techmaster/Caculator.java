package vn.techmaster;

public class Caculator {
    public void pheptinh(double a, double b){
        double tong = (a+b);
        double hieu = (a-b);
        double tich = (a*b);
        double thuong = (a/b);
        System.out.println("*Bài Tập 1* \nThực hiện các phép toán: \n*Cộng - Trừ - Nhân - Chia*");
        System.out.println("Tổng 2 số là: " + tong);
        System.out.println("Hiệu 2 số là: " + hieu);
        System.out.println("Tích 2 số là: " + tich);
        System.out.println("Thương 2 số là: " + thuong);
        System.out.println("-----------------------------");
    }
}
