package vn.techmaster;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    public static String EMAIL_REGEX = "^(.+)@(\\S+)$";
    public static String MOBILE_REGEX = "\\d{10,11}";
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return ((Matcher) matcher).matches();
    }

    public static boolean validateMobile(String mobile){
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }

    public static long validateSalary(){
        Scanner sc = new Scanner(System.in);
        long salary = 0;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                salary = Long.parseLong(sc.nextLine());
                if (salary < 0 ) throw new MyException("Lương phải là số dương");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return salary;
    }

}
