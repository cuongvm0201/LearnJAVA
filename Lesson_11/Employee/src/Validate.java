
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static String EMAIL_REGEX = "^(.+)@(\\S+)$";
    public static String MOBILE_REGEX = "\\d{10,11}";
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateMobile(String mobile){
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }


    public static String checkName() {
        Scanner sc = new Scanner(System.in);
        String name = null;
        boolean isCheck = false;
        while (!isCheck) {
            try {
                name = sc.nextLine();
                if (name.trim().isEmpty()) throw new MyException("Bạn chưa nhập tên, ");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + " vui lòng nhập lại");
            }
        }
        return name;
    }

    public static String checkEmail() {
        Scanner sc = new Scanner(System.in);
        String email = null;
        boolean isCheck = false;
        while (!isCheck) {
            try {
                email = sc.nextLine();
                if (!Validate.validateEmail(email)) throw new MyException("Nhập Email không hợp lệ, ");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + "vui lòng nhập lại");
            }
        }
        return email;

    }

    public static String checkphone() {
        Scanner sc = new Scanner(System.in);
        String phone = null;
        boolean isCheck = false;
        while (!isCheck) {
            try {
                phone = sc.nextLine();
                if (!Validate.validateMobile(phone)) throw new MyException("Nhập số đt 10 hoặc 11 số, ");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + "vui lòng nhập lại");
            }
        }
        return phone;

    }

}



