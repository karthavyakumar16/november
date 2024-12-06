package com.neoteric.november.november.sets;

import java.util.Iterator;
import java.util.Set;

public class HashSet {




        public static void main(String[] args) {
            Set<String> set = new java.util.HashSet<>();

            // Adding elements
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");

            // Iterating using Iterator
            System.out.println("Iterating using Iterator:");
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println(fruit);
            }
            System.out.println("Using Streams to process elements:");
            set.stream()
                    .forEach(fruit -> System.out.println(fruit));
        }
    }



