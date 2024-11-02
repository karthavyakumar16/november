package com.neoteric.november.november.polymorpisim2;

import com.neoteric.november.november.polymorpisim2.Payments2;
import com.neoteric.november.november.polymorpisim2.Phonepay;
import com.neoteric.november.november.polymorpisim2.UPIPayments;

public class PhonePayTest {
    public static void main(String[] args) {
        UPIPayments phonepay2=new Phonepay();
        Payments2 payment2= phonepay2.transfer("9652295359","9949404512",1000.0);
        System.out.println(payment2);
        System.out.println("from account balance"+Phonepay.accountBalanceMap.get("9652295359"));
        System.out.println("to account balance"+ Phonepay.accountBalanceMap.get("9949404512"));

    }
    }

