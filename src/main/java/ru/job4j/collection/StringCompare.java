package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String shortString = left.length() < right.length() ? left : right;
        for (int i = 0; i < shortString.length(); i++) {
            if (left.charAt(i) == right.charAt(i)) {
                continue;
            }
            if (left.charAt(i) > right.charAt(i)) {
                return 1;
            }
            if (left.charAt(i) < right.charAt(i)) {
                return -1;
            }
        }
        return left.length() - right.length();
    }
}