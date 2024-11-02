package com.neoteric.november.november.polymorpisim;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Phonepay implements UPIPayments {

    static Map<String, Double> accountBalanceMap = new HashMap<>();
    static Map<String, ArrayList<Payments>> accountHistoryMap = new HashMap<>();

    static {
        accountBalanceMap.put("9652295359", 150000.0);
        accountBalanceMap.put("9949404512", 5000.0);
    }

    BiPredicate<String, Double> balanceCheck = (accountNumber, amt) -> {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > amt) {
            return true;

        } else {
            return false;
        }
    };

    BiPredicate<String, Double> dailyLimitCheck = (accountNumber, amt) -> {
        Double dailyLimit = 10000.0;
        ArrayList<Payments> paymentHistoryList = accountHistoryMap.get(accountNumber);
        if (paymentHistoryList != null) {
            Double totalTranscationAmount = 0.0;
            for (int i = 0; i < paymentHistoryList.size(); i++) {
                Payments pay = paymentHistoryList.get(i);
                totalTranscationAmount = totalTranscationAmount + pay.getAmount();
            }
            if (totalTranscationAmount < dailyLimit) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    };

    @Override
    public Payments transfer(String fromMobileNumber, String toNumber, Double amount) {

        Payments payments = new Payments();
        if (balanceCheck.test(fromMobileNumber, amount)) {
            if (dailyLimitCheck.test(fromMobileNumber, amount)) {

                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toNumber);

                Double fromTotalBalance = fromAccountBalance - amount;
                Double toTotalBalance = toAccountBalance + amount;

                accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
                accountBalanceMap.put(toNumber, toTotalBalance);

                payments.setStatus(PaymentStatus.Completed.getMessage());
                payments.setTxnId(UUID.randomUUID().toString());
                payments.setDate(new Date());
                payments.setUtrId(UUID.randomUUID().toString());
                payments.setAmount(amount);


                ArrayList<Payments> paymentsArrayList = accountHistoryMap.get(fromMobileNumber);
                if (paymentsArrayList != null) {
                    paymentsArrayList.add(payments);
                } else {
                    paymentsArrayList = new ArrayList<Payments>();
                    paymentsArrayList.add(payments);
                    accountHistoryMap.put(fromMobileNumber, paymentsArrayList);
                }
            }
            else{

                    payments.setStatus(PaymentStatus.FAILED_DAILY_LIMIT.getMessage());
                    payments.setTxnId(UUID.randomUUID().toString());
                    payments.setDate(new Date());
                    payments.setUtrId(UUID.randomUUID().toString());
                }
            } else {

                payments.setStatus(PaymentStatus.failed.getMessage());
                payments.setTxnId(UUID.randomUUID().toString());
                payments.setDate(new Date());
                payments.setUtrId(UUID.randomUUID().toString());
            }
            return payments;
        }

    }

