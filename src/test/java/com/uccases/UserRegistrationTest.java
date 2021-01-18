package com.uccases;

import org.junit.Assert;
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
        boolean result = userRegistration.firstName("Kabaddi");
        Assert.assertTrue(result);
    }
    @Test
    public void WhenNotProperLastName_Should_ReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstName("Ka");
        Assert.assertFalse(result);
    }
}
