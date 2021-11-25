package vn.techmaster;

import java.util.Scanner;

public class MinMax {
    public static void minmax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        int [] strArray = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Nhập phần tử vị trí %d: ", i);
            strArray[i] = sc.nextInt();
        }

//        int min = strArray[0];
//        for (int i = 0; i < strArray.length ; i++){
//            if (min > strArray[i]){
//                min = strArray[i];
//            }
//        }
//        System.out.println(min);

        int max = strArray[0];
        for (int i = 0; i < strArray.length ; i++){
            if (max < strArray[i]){
                max = strArray[i];
            }
        }
        System.out.println(max);

    }
}
