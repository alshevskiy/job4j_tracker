package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] chars = password.toCharArray();
        boolean first = false, second = false, third = false, forth = false;
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                first = true;
            }
            if (Character.isLowerCase(ch)) {
                second = true;
            }
            if (Character.isDigit(ch)) {
                third = true;
            }
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                forth = true;
            }
        }
        if (!first) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!second) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!third) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!forth) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] substrings = {"qwerty", "12345", "password", "admin", "user"};
        for (String sub: substrings) {
            if (password.toLowerCase().contains(sub.toLowerCase())) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, "
                       + "12345, password, admin, user");
            }
        }
        return password;
    }
}