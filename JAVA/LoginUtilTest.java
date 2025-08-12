package com.Assignment.Day1;
import static org.junit.Assert.*;
import org.junit.Test;

public class LoginUtilTest {

    @Test
    public void testValidLogin() {
        assertTrue(LoginUtil.validateLogin("admin", "password123"));
    }

    @Test
    public void testInvalidLogin() {
        assertFalse(LoginUtil.validateLogin("admin", "wrongpass"));
        assertFalse(LoginUtil.validateLogin("user", "password123"));
    }

    @Test
    public void testEmptyInputs() {
        assertFalse(LoginUtil.validateLogin("", ""));
        assertFalse(LoginUtil.validateLogin("admin", ""));
        assertFalse(LoginUtil.validateLogin("", "password123"));
    }

    @Test
    public void testNullUsername() {
        try {
            LoginUtil.validateLogin(null, "password123");
            fail("Expected IllegalArgumentException for null username");
        } catch (IllegalArgumentException e) {
            assertEquals("Username or password cannot be null", e.getMessage());
        }
    }

    @Test
    public void testNullPassword() {
        try {
            LoginUtil.validateLogin("admin", null);
            fail("Expected IllegalArgumentException for null password");
        } catch (IllegalArgumentException e) {
            assertEquals("Username or password cannot be null", e.getMessage());
        }
    }

    @Test
    public void testNullBoth() {
        try {
            LoginUtil.validateLogin(null, null);
            fail("Expected IllegalArgumentException for null inputs");
        } catch (IllegalArgumentException e) {
            assertEquals("Username or password cannot be null", e.getMessage());
        }
    }
}
