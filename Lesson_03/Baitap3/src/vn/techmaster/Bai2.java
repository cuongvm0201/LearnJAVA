package vn.techmaster;

import java.util.Scanner;

public class Bai2 {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    public void gptBac2 (){
        System.out.println("Nhập vào số a khác 0: ");
        a = sc.nextInt();
        while (a == 0) {
            System.out.println("Yêu cầu số a khác 0, vui lòng nhập lại");
            a = sc.nextInt();
        }
        System.out.println("Nhập vào số b bất kỳ: ");
        b = sc.nextInt();
        System.out.println("Nhập vào số c bất kỳ: ");
        c = sc.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x2 + " + b + "x + " + c + " = 0.");
    }
    public void dapan (){
        double delta = (double) b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phương Trình Trên Vô Nghiệm");
            }
            if (delta == 0) {
                System.out.println("Phương Trình Có Nghiệm Kép:" + "x1 = x2 = " + (-b / (2 * a)));
            }
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương Trình Có 2 Nghiệm: x1 = %.2f và x2 = %.2f\n", x1, x2);

        }
        System.out.println("---------------------------------------");
        System.out.println("Bài Tập 3: Liệt Kê Các Số Nguyên Tố <20");

    }
}
