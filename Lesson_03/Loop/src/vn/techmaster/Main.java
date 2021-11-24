package vn.techmaster;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*for(int i = 1; i <= 100; i++){
        if(i%3==0) { //i chia hết cho cả 3 và 5
            if (i%5 == 0) {
                System.out.println("FizzBuzz");
            } else { //i chỉ chia hết cho 3 không chia hết cho 5
                System.out.println("Fizz");
            }
        }else{
                if(i%5 == 0){ //i chỉ chia hết cho 5 không chia hết cho 3
                System.out.println("Buzz");
            }else{ //i không chia hết cho cả 3 và 5
                System.out.println(i);
            }
        }
    }
        for(int i = 1; i <= 50; i++){
            if(i%3==0){
                System.out.println("Fizz1");
            }else{System.out.println(i);};
            if(i%5==0){
                System.out.println("Buzz1");
            }else{System.out.println(i);};
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz1");
            }else{System.out.println(i);};
        }*/
    /*int i = 0;
    while(i < 10){
        System.out.println("Xin Chào");
        i++;
    }*/
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Nhập 1 số bất kỳ: ");
            number = sc.nextInt();
            if(number < 0){
                System.out.println("Bạn nhập số âm ");
            }else if (number > 0 && number < 18){
                System.out.println("Bạn chưa đủ tuổi bầu cử");
            }else if (number >= 18 && number <100){
                System.out.println("Bạn đủ tuổi bầu cử");
            } else if (number == 0){
                isCheck = true;
            }
            else {
                System.out.println("Bạn lớn tuổi quá rồi");
            }
        }

        System.out.println("Nhập 1 số bất kỳ: ");



    }
}
