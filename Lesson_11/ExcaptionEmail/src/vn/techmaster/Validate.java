package vn.techmaster;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean emailValidator(String email) {
        String EMAIL_REGIX = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(EMAIL_REGIX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}