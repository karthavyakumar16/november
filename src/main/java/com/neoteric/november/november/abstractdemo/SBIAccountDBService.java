package com.neoteric.november.november.abstractdemo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SBIAccountDBService {

    public static Map<String,Account> accountMap=new HashMap<>();
    public static Map<String, ArrayList<Beneficary>> accountBeneficaryMap=new HashMap<>();

    public static Map<String,Transaction> accountTransactionMap=new HashMap<>();
}
