package com.neoteric.november.november.abstractdemo;

public interface RetailAccountService extends AccountService {
    Account createAccount(String adhar,String pan);
}
