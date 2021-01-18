package com.uccases;

import java.util.regex.Pattern;

public class UserRegistration {
    static String firstName = "^[A-Z][a-zA-Z]{2,}$";
    public static boolean firstName(String fname) {
        Pattern pattern = Pattern.compile(firstName);
        return pattern.matcher(fname).matches();
    }
}
