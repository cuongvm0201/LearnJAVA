package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class listNumber {
    public static void questFour2() {

        // số nguyên tố <10
        int n = 10;
        System.out.println("\nCác số nguyên tố nhỏ hơn " + n + " là: ");
        for (int i = 2; i <= n; i++) {
            boolean isNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isNguyenTo = false;
                    break;
                }
            }
            if (isNguyenTo) {
                System.out.printf(" "+i);
            }
            }
        System.out.println("\n----------------------");

    }
}