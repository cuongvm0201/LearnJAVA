package vn.techmaster;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*int age = -151;
        if(age >= 18){
            System.out.println("Bạn đủ tuổi bầu cử");
            if(age >150){
                System.out.println("Bạn bất tử à");
            }
        }else{//age <18
            System.out.println("Bạn chưa đủ tuổi bầu cử");
            if(age < 0){
                System.out.println("Tuổi âm mất rồi");
            }
        }*/

        //if else if else có điều kiện

        /*
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        double bmi =  BmiCacaulator.bmi(height, weight);
        */
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Nhập tháng bất kỳ: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 3:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 5:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 7:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 10:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 12:
                System.out.println("Tháng ngày có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng ngày có 28 hoặc 29 ngày");
                break;
            case 4:
                System.out.println("Tháng ngày có 30 ngày");
                break;
            case 6:
                System.out.println("Tháng ngày có 30 ngày");
                break;
            case 9:
                System.out.println("Tháng ngày có 30 ngày");
                break;
            case 11:
                System.out.println("Tháng ngày có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng này");
                break;
        }
        sc.close();
        System.out.println("Kết thúc chương trình");*/
                int a, b; // Bài Tập GPT Bậc 1
                double nghiem;

                System.out.println("Nhập vào số a: ");
                a = sc.nextInt();
                System.out.println("Nhập vào số b: ");
                b = sc.nextInt();
                System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phương trình này có vô số nghiệm.");
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                } else {
                    nghiem = (double) -b / a;
                    System.out.printf("Phương trình có nghiệm = %.2f",nghiem);
                }




    }
}