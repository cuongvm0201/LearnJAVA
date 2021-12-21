package com.company;

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
}