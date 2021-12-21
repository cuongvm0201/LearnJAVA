package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Boolean isCheck = false;
//        while (!isCheck)
//            try {
//                // đoạn code có thể ném ra ngoại lệ
//                System.out.println(" Nhập a");
//                int a = Integer.parseInt(sc.nextLine());
//                System.out.println(" Nhâp b");
//                int b = Integer.parseInt(sc.nextLine());
//                int c = a / b;
//                System.out.println(c);
//                isCheck = true;
//            } catch (ArithmeticException e) {
//                // Xử lý ngoại lệ
//                System.out.println("Xảy ra ngoại lệ, yêu cầu nhập lại: ");
//            } catch (NumberFormatException e){
//                System.out.println("Bạn phải nhập số, yêu cầu nhập lại: ");
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//            }finally {
//                System.out.println("Khối nay luôn được thực thi");
//            }


//        System.out.println("Nhập chiều cao: ");
//        double height = input();
//        System.out.println("Nhập cân nặng: ");
//        double weight = input();
//        double bmi = weight / (height * height);
//        System.out.println("Chỉ số bmi là: " + bmi);

        int age = checkAge();
        if (age >= 18) {
            System.out.println("Bạn đủ tuổi bầu cử");
        }


    }

    public static double input() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number <= 0) throw new ArithmeticException("Nhập số không hợp lệ");
                isCheck = true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }

        return number;
    }

    public static int checkAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi: ");
        int age = 0;
//        int age = Integer.parseInt(sc.nextLine());
//        if(age <= 0) throw new MyException("Tuổi phải lớn hơn 0");
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age <= 0) throw new MyException("Tuổi phải lớn hơn 0");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            } catch (NumberFormatException e) {
                System.out.println("Bạn cần phải nhập số, vui lòng nhập lại");
            }
        }
        return age;

    }
}
