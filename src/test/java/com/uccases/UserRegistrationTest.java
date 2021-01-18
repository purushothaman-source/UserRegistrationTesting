package com.uccases;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void WhenProperFirstName_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName("Purushoth");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperFirstName_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName("Pu");
        Assert.assertFalse(result);
    }
    @Test
    public void WhenProperLastName_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastName("Kabaddi");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperLastName_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastName("Ka");
        Assert.assertFalse(result);
    }
    @Test
    public void WhenProperEmail_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email("purushoth99jun@gamil.com");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperEmail_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email("puru99jun.com");
        Assert.assertFalse(result);
    }
    @Test
    public void WhenProperMobile_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.mobile("91 7708919016");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperMobile_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.mobile("7708919016");
        Assert.assertFalse(result);
    }
    @Test
    public void WhenProperPassword_Should_ReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password("abcD1234");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperPassword_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password("abcd12345");
        Assert.assertFalse(result);
    }
}
