package com.neoteric.november.november.exception;

public class Throw {


        public static void main(String[] args) {
            try {
                checkAge(25);
            } catch (Exception e) {
                System.out.println("Exception caught: " + e);
            }
        }

        static void checkAge(int age) {
            if (age < 18) {
                throw new ArithmeticException("Age must be at least 18");
            }
            System.out.println("Age is valid");
        }
    }


