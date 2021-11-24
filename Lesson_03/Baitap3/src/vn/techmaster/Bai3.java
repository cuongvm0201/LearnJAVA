package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void songuyento() {
        int n = 20;
        System.out.println("Các số nguyên tố nhỏ hơn "+n+ " là: ");
        for(int i = 1; i<n; i++) {
            int test = 0;
            for(int j = 1; j<=i; j++)
            {
                if(i%j==0)
                {
                    test++;
                }
            }
            if(test==2)
            {
                System.out.print(" "+i);
            }
        }
    }

}

