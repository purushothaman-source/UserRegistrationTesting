package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends UserRegistration {

    @Test
    public void WhenProperFirstName_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = firstName.check("Purushoth");
            ;
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperFirstName_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = firstName.check("Pu");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }

    @Test
    public void WhenProperLastName_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = lastName.check("Kabaddi");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperLastName_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = lastName.check("Ka");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }

    @Test
    public void WhenProperEmail_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = email.check("purushoth99jun@gamil.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperEmail_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = email.check("puru99jun.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }

    @Test
    public void WhenProperMobile_Should_ReturnTrue() {
        boolean result = false;
        try {
            result = mobile.check("91 7708919016");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperMobile_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = mobile.check("7708919016");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }

    @Test
    public void WhenProperPassword_Should_ReturnTrue() {
        try {
            boolean result = password.check("Purushoth99");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }

    @Test
    public void WhenNotProperPassword_Should_ReturnFalse() {
        boolean result = false;
        try {
            result = password.check("Purushoth");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }
}
