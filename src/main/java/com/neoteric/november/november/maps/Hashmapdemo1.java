package com.neoteric.november.november.maps;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo1 {
    public static void main(String[] args) {


        Map<String, Integer> map1 = new HashMap<>();

        map1.put("telugu", 75);
        map1.put("hindi", 65);
        map1.put("english", 90);
        map1.put("maths", 80);
        map1.put("science", 80);
        map1.put("social", 95);

        map1.entrySet().stream().forEach(entry2 ->{
            System.out.println(entry2.getKey()+"value"+entry2.getValue());
        });

        map1.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80) // Filtering condition
                .forEach(entry3 -> {
                    System.out.println(entry3.getKey() + " -> " + entry3.getValue());
                });
        map1.entrySet().stream()
        .filter(entry -> entry.getValue() < 80)
                .forEach(entry5 -> {
                    System.out.println(entry5.getKey() + " -> " + entry5.getValue());
                });
        map1.entrySet().stream()
                .filter(entry -> entry.getKey().equals("maths") || entry.getKey().equals("science"))
                .forEach(entry6 -> {
                    System.out.println(entry6.getKey() + " -> " + entry6.getValue());
                });
    }
}