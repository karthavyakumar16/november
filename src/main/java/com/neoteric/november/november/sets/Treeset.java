package com.neoteric.november.november.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {





        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();

            // Adding elements
            set.add(10);
            set.add(5);
            set.add(20);
            set.add(15);

            // Trying to add duplicate
            set.add(10); // Ignored as a duplicate

            // Iterating using Iterator
            System.out.println("Iterating using Iterator:");
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                Integer number = iterator.next();
                System.out.println(number);
            }

            // Using Streams to process elements
            System.out.println("Using Streams to process elements:");
            set.stream().forEach(System.out::println);

            // Using Streams to filter and process
            System.out.println("Filtered elements (greater than 10):");
            set.stream().filter(number -> number > 10).forEach(System.out::println);
        }
    }


