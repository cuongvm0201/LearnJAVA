package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArray {
    public static void questSix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng:");
        int n = sc.nextInt();
        System.out.println("Nhập số cột của mảng:");
        int m = sc.nextInt();
        int[][] strArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                strArray[i][j] = sc.nextInt();

            }
        }
        System.out.println("Mảng vừa nhập là: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(strArray[i][j] + "\t");
                }

            System.out.println("\n");
            }
            System.out.println("Các phần tử thuộc đường chéo chính là: ");
            for (int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(i==j){
                        System.out.print(" "+strArray[i][j]);
                    }
                }
            }
            sc.close();
    }
}
