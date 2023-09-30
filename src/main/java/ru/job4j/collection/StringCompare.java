package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int lengthOfShortString = Math.min(left.length(), right.length());
        for (int i = 0; i < lengthOfShortString; i++) {
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