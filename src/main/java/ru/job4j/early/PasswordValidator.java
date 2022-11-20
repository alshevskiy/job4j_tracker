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
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                upper = true;
            }
            if (Character.isLowerCase(ch)) {
                lower = true;
            }
            if (Character.isDigit(ch)) {
                digit = true;
            }
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                special = true;
            }
            if (upper && lower && digit && special) {
                break;
            }
        }
        if (!upper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!special) {
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