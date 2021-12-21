package vn.techmaster;

import java.util.Scanner;

public class Input {
    public static String newEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email: ");
        String email = null;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                email = sc.nextLine();
                if (!Validate.emailValidator(email)) throw new MyException("Email không đúng định dạng");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return email;

    }
}
