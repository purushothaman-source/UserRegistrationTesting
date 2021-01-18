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
}
