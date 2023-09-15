package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("mail1@email.com", "Name1 LastName1");
        map.put("mail2@email.com", "Name2 LastName2");
        map.put("mail3@email.com", "Name3 LastName3");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
