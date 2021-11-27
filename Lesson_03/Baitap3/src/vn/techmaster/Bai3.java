package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void songuyento() {
        int n = 20;
        System.out.println("Các số nguyên tố nhỏ hơn "+n+ " là: ");
//        for(int i = 2; i<n; i++) {
//            int test = 0;
//            for(int j = 1; j<=i/2; j++)
//            {
//                if(i%j==0)
//                {
//                    test++;
//                }
//            }
//            if(test==1)
//            {
//                System.out.print(" "+i);
//            }
//        }
        for(int i=2;i<=n;i++) {


            boolean isNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isNguyenTo = false;
                    break;
                }
            }
            if (isNguyenTo) {
                System.out.printf(" " + i);
            }
        }
    }

}

