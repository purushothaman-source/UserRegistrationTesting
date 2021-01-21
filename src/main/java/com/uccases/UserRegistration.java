package com.uccases;

import java.util.regex.Pattern;

public class UserRegistration {

    static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    static final String MOBILE_PATTERN = "^91[ ][6-9][0-9]{9}$";
    static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

    public static boolean firstName(String fname) throws UserRegistrationException {

            Pattern pattern = Pattern.compile(NAME_PATTERN);
            if(pattern.matcher(fname).matches())return true;
            throw new UserRegistrationException("Please Enter Proper firstName");
    }


    public static boolean lastName(String lname) throws UserRegistrationException {

            Pattern pattern = Pattern.compile(NAME_PATTERN);
            if(pattern.matcher(lname).matches())return true;
            throw new UserRegistrationException("please Enter Proper lastname");

    }

    public boolean email(String email) throws UserRegistrationException {

            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            if(pattern.matcher(email).matches()) return true;
            throw new UserRegistrationException("please Enter Proper email");

    }

    public boolean mobile(String mobile) throws UserRegistrationException {

        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
            if(pattern.matcher(mobile).matches()) return true;
            throw new UserRegistrationException("please Enter Proper mobile");
    }

    public boolean password(String password) throws UserRegistrationException {

            Pattern pattern = Pattern.compile(PASSWORD);
            if(pattern.matcher(password).matches())return true;
            throw new UserRegistrationException("please Enter Proper password");
    }
}
