package com.uccases;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
  private String email2Test;
    private boolean expectedResult;

    public ValidEmailTest(String email2Test, boolean expectedResult) {
        this.email2Test = email2Test;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return  Arrays.asList(new Object[][]{{"purushoth99jun@gmail.com", true},
                {"siva99jun", false},
                {"abc-100@gmail.com", true},
                {"abc.100@yahoo.com", true},
                {"abc+100@gmail.com", true}});
    }


    @Test
    public void givenEmailasVar_shouldReturnAsPerCase()  {
        UserRegistration userRegistration=new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.email(this.email2Test);
            Assert.assertEquals(this.expectedResult,result);
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
            Assert.assertEquals("please Enter Proper email",exception.getMessage());
        }
    }
}
