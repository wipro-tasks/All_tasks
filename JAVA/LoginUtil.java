package com.Assignment.Day1;

public class LoginUtil {

    // Simulated login method (replace with real validation logic if needed)
    public static boolean validateLogin(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username or password cannot be null");
        }
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // Simulated correct credentials
        return username.equals("admin") && password.equals("password123");
    }
}
