package com.neoteric.november.november.abstractdemo;

public interface CorparateAccountService extends AccountService{

    Account createAccount(String gst,String pan);
}
