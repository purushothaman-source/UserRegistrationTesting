package com.uccases;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void WhenProperFirstName_Should_ReturnTrue()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.firstName("Purushoth");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }
    @Test
    public void WhenNotProperFirstName_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.firstName("Pu");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("Please Enter Proper firstName", exception.getMessage());
        }
    }
    @Test
    public void WhenProperLastName_Should_ReturnTrue()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.lastName("Kabaddi");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }
    @Test
    public void WhenNotProperLastName_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.lastName("Ka");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper lastname", exception.getMessage());
        }
    }
    @Test
    public void WhenProperEmail_Should_ReturnTrue()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.email("purushoth99jun@gamil.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }
    @Test
    public void WhenNotProperEmail_Should_ReturnFalse()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.email("puru99jun.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper email", exception.getMessage());
        }
    }
    @Test
    public void WhenProperMobile_Should_ReturnTrue()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.mobile("91 7708919016");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }
    @Test
    public void WhenNotProperMobile_Should_ReturnFalse()  {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.mobile("7708919016");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper mobile", exception.getMessage());
        }
    }
    @Test
    public void WhenProperPassword_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result = userRegistration.password("Purushoth99");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }
    @Test
    public void WhenNotProperPassword_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.password("Purushoth");
            Assert.assertTrue(result);
        } catch (UserRegistrationException exception) {
            Assert.assertEquals("please Enter Proper password", exception.getMessage());
        }
    }
}
