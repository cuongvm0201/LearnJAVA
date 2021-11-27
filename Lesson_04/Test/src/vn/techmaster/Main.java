package vn.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int [] strArray = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Nhập phần tử của mảng ở vị trí %d: ", i);
            strArray[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(strArray[i]);
        }

        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++)
            {
                if(strArray[i]<strArray[j]){

                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;

                }


            }
        }
        System.out.println("Thứ tự mảng từ lớn đến bé: ");
        for (int i = 0; i < n; i++){
            System.out.print(" " +strArray[i]);
        }

    }
}
