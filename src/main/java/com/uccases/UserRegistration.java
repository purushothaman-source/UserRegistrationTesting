package com.uccases;

import java.util.regex.Pattern;

public class UserRegistration {
    static final String NAME = "^[A-Z][a-zA-Z]{2,}$";
    public static boolean firstName(String fname) {
        Pattern pattern = Pattern.compile(NAME);
        return pattern.matcher(fname).matches();
    }
    public static boolean lastName(String lname) {
        Pattern pattern = Pattern.compile(NAME);
        return pattern.matcher(lname).matches();
    }
}
