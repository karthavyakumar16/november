package com.neoteric.november.november.abstractdemo;

import java.util.ArrayList;

public class BeneficaryService {

    Beneficary addBeneficary(Account account, Beneficary beneficary) {
        ArrayList<Beneficary> beneficiaryArrayList = SBIAccountDBService.accountBeneficaryMap.get(account.getAccount());
        if (beneficiaryArrayList != null) {
            beneficiaryArrayList.add(beneficary);
        } else {
            beneficiaryArrayList = new ArrayList<Beneficary>();
            beneficiaryArrayList.add(beneficary);
            SBIAccountDBService.accountBeneficaryMap.put(account.getAccount(), beneficiaryArrayList);
        }

        return beneficary;
    }

}