package vn.techmaster;

import java.util.Scanner;

public class printStar {
    public static void questOne (){
        System.out.println("In ra hình vuông");
       int i = 0;
       for (i = 0; i <4 ; i++){
           for (int j = 0; j <4; j++){
               System.out.print("*" + "\t");
           }
           System.out.println();
       }
        System.out.println("----------------------");
        System.out.println("In ra hình tam giác 1");
        for (i = 0; i <4 ; i++){
            for (int j = 0; j <=i; j++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        
        System.out.println("----------------------");
        }
    }

