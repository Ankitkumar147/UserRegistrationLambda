package com.Bridgelabz.Regex;

import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class UserRegistrationEmailsTest {
    @RunWith(Parameterized.class)
    public static class EmailFormatTester {
        private String email;
        private boolean expectedResult;
        private UserRegistration obj1;

        @Before
        public void initialize() {
            obj1 = new UserRegistration();
        }

        public EmailFormatTester(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true}, {"abc111@abc.com", true},
                    {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
                    {"abc@1.com", true}, {"abc@gmail.com.com", true},
                    {"abc+100@gmail.com", true}, {"abc", false}, {"abc@.com.my", false},
                    {"abc123@gmail.a", false}, {"abc123@.com", false},
                    {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false},
                    {"abc..2002@gmail.com", false}, {"abc.@gmail.com", false},
                    {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false},
                    {"abc@gmail.com.aa.au", false}, {"abc1..@gmail.com", false}});
        }

        @Test
        public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
            Method method = UserRegistration.class.getDeclaredMethod("validateEmail", String.class);
            method.setAccessible(true);
            method.invoke(this.expectedResult, "ankit1234@gmail.com");
        }
    }
}
