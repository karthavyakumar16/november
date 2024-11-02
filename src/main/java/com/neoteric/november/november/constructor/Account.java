package com.neoteric.november.november.constructor;

public class Account {

    public String name;
    public String adhar;
    public String number;
    public int balance;


    public static String bank="sbi";


    public Account(String name, String adhar, String number) {
        this.name = name;
        this.adhar = adhar;
        this.number = number;
    }

    public Account(String name, String adhar, String number, int balance) {
        this.name = name;
        this.adhar = adhar;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", adhar='" + adhar + '\'' +
                ", number='" + number + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
