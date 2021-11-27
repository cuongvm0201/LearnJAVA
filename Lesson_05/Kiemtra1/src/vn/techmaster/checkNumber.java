package vn.techmaster;

import java.util.Random;

public class checkNumber {
    public static void questThree (){
        Random rad = new Random();
        int number = rad.nextInt(1000);
        System.out.println("Số ngẫu nhiên: " + number);

        boolean isNguyenTo = true;
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                isNguyenTo = false;
                System.out.printf("Số ngẫn nhiên: " + number + " không phải số nguyên tố." );
            }
        }
        if (isNguyenTo)
        {
            System.out.printf("Số ngẫu nhiên: " + number + " là số nguyên tố.");
        }
        System.out.println("\n----------------------");
    }
}
