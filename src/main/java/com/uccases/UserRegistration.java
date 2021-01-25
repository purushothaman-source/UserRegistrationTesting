package com.uccases;

import java.util.regex.Pattern;

public class UserRegistration  {

    static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    static final String MOBILE_PATTERN = "^91[ ][6-9][0-9]{9}$";
    static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

    IUserRegistration validate = (name,regex) -> {
        Pattern pattern = Pattern.compile(regex);
        try {
            if (name.length() == 0)
                throw new UserRegistrationException("Please Enter Proper message");
            if (pattern.matcher(name).matches()) return true;
            throw new UserRegistrationException("Please Enter Proper message");
        } catch (NullPointerException exception) {
            throw new UserRegistrationException("Please Enter Proper message");
        }
    };



    /*IUserRegistration name = (name) -> {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        try {
            if (name.length() == 0)
                throw new UserRegistrationException("Please Enter Proper firstName");
            if (pattern.matcher(name).matches()) return true;
            throw new UserRegistrationException("Please Enter Proper firstName");
        } catch (NullPointerException exception) {
            throw new UserRegistrationException("Please Enter Proper firstName");
        }
    };



    IUserRegistration email = (n) -> {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        try {
            if (n.length() == 0)
                throw new UserRegistrationException("please Enter Proper email");
            if (pattern.matcher(n).matches()) return true;
            throw new UserRegistrationException("please Enter Proper email");
        } catch (NullPointerException exception) {
            throw new UserRegistrationException("please Enter Proper email");
        }
    };

    IUserRegistration mobile = (n) -> {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        try {
            if (n.length() == 0)
                throw new UserRegistrationException("please Enter Proper mobile");
            if (pattern.matcher(n).matches()) return true;
            throw new UserRegistrationException("please Enter Proper mobile");
        } catch (NullPointerException exception) {
            throw new UserRegistrationException("please Enter Proper mobile");
        }
    };

    IUserRegistration password = (n) -> {
        Pattern pattern = Pattern.compile(PASSWORD);
        try {
            if (n.length() == 0)
                throw new UserRegistrationException("please Enter Proper password");
            if (pattern.matcher(n).matches()) return true;
            throw new UserRegistrationException("please Enter Proper password");
        } catch (UserRegistrationException exception) {
            throw new UserRegistrationException("please Enter Proper password");
        }
    };
*/
}

