package com.neoteric.november.november.polymorpisim;

public class PhonePayTest {
    public static void main(String[] args) {
        UPIPayments phonepay=new Phonepay();
        Payments payment1= phonepay.transfer("9652295359","9949404512",5000.0);
        System.out.println(payment1.getStatus());
        Payments payment2= phonepay.transfer("9652295359","9949404512",5000.0);
        System.out.println(payment2.getStatus());
        Payments payment3= phonepay.transfer("9652295359","9949404512",200000.0);
        System.out.println(payment3.getStatus());


        System.out.println("from account balance"+Phonepay.accountBalanceMap.get("9652295359"));
        System.out.println("to account balance"+Phonepay.accountBalanceMap.get("9949404512"));

    }
}
