package vn.techmaster;

import java.util.Scanner;

public class Bai1 {
    public void gptBac1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bài Tập 1: Giải Phương Trình Bậc 1");
        int a, b;
        System.out.println("Nhập vào số nguyên a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        b = sc.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -b / a;
            System.out.printf("Phương trình có nghiệm x = %.2f\n",nghiem);
        }
        System.out.println("---------------------------------------");
        System.out.println("Bài Tập 2: Giải Phương Trình Bậc 2 với a khác 0");
    }
}
