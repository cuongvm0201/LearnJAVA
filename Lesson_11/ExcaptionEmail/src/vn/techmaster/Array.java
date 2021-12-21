package vn.techmaster;

import java.util.Scanner;

public class Array {
    public static String []newArr (){
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Nhập n: ");
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0) throw new ArithmeticException("Nhập số dương mới chuẩn nhé bạn ơi");

                isCheck = true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e) {
                System.out.println("Chỉ được nhập số, vui lòng nhập lại");
            }
        }
        String [] testArr = new String[n];
        return testArr;

    }
}
