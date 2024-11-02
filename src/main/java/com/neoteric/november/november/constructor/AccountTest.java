package com.neoteric.november.november.constructor;

public class AccountTest {


    int i=10;
    static int j=10;

    public void method1(){

    }
    public static void main(String[] args) {
        Account account=new Account("kk","11234","96522");
        System.out.println(account+Account.bank);

        Account account1=new Account("kumar","2341","994940",500);
        System.out.println(account1+Account.bank);

    }
}
