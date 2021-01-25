package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest    {

    static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    static final String MOBILE_PATTERN = "^91[ ][6-9][0-9]{9}$";
    static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";


    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration =  new UserRegistration();
        boolean result;
        try {
            result = userRegistration.validate.check("Purushoth",NAME_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenProper_Should_ReturnFalse() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("Pu",NAME_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenProperLastName_Should_ReturnTrue() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("Kabaddi",NAME_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperLastName_Should_ReturnFalse() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("Ka",NAME_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenProperEmail_Should_ReturnTrue() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("purushoth99jun@gamil.com",EMAIL_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperEmail_Should_ReturnFalse() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("puru99jun.com",EMAIL_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenProperMobile_Should_ReturnTrue() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("91 7708919016",MOBILE_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperMobile_Should_ReturnFalse() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("7708919016",MOBILE_PATTERN);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenProperPassword_Should_ReturnTrue() {
        UserRegistration userRegistration =  new UserRegistration();
        try {
            boolean result = userRegistration.validate.check("Purushoth99",PASSWORD);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperPassword_Should_ReturnFalse() {
        boolean result;
        UserRegistration userRegistration =  new UserRegistration();
        try {
            result = userRegistration.validate.check("Purushoth",PASSWORD);
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper message", exception.getMessage());
        }
    }
}
