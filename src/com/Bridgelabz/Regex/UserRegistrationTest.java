package com.Bridgelabz.Regex;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration userRegistration;

    @Before
    public void setup(){
        Object userRegistration = new UserRegistration();
    }
    @Test
    void main() {
    }

    @Test
    public void validateFirstNameIsCapital() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = UserRegistration.class.getDeclaredMethod("validateFirstNameIsCapital",String.class );
        method.setAccessible(true);
        method.invoke(userRegistration,"Ankit");
    }
    @Test
    public void validateLastNameIsCapital() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = UserRegistration.class.getDeclaredMethod("validateLastName",String.class);
        method.setAccessible(true);
        method.invoke(userRegistration,"Kumar");
    }
    @Test
    public void validatePhoneNumber() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = UserRegistration.class.getDeclaredMethod("validatePhoneNumber",String.class);
        method.setAccessible(true);
        method.invoke(userRegistration,"918708893545");
    }
}

