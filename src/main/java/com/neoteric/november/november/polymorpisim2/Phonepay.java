package com.neoteric.november.november.polymorpisim2;





import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiPredicate;

public class Phonepay implements UPIPayments {

        static final int DAILY_TRANSACTION_LIMIT = 10;
        static final double DAILY_AMOUNT_LIMIT = 100000.0;

        static Map<String, Double> accountBalanceMap = new HashMap<>();
        static Map<String, TransactionTracker> dailyTransactionMap = new HashMap<>();

        static {
            accountBalanceMap.put("9652295359", 1000000.0);
            accountBalanceMap.put("9949404512", 20000.0);
        }

        BiPredicate<String, Double> balanceCheck = (accountNumber, amt) -> {
            Double accountBalance = accountBalanceMap.get(accountNumber);
            return accountBalance != null && accountBalance >= amt;
        };

        BiPredicate<String, Double> dailyLimitCheck = (accountNumber, amount) -> {
            TransactionTracker tracker = dailyTransactionMap.get(accountNumber);
            if (tracker == null) {
                tracker = new TransactionTracker();
                dailyTransactionMap.put(accountNumber, tracker);
            } else if (!tracker.isSameDay()) {
                tracker.reset();
            }
            return tracker.canTransact(amount);
        };

        @Override
        public Payments2 transfer(String fromMobileNumber, String toNumber, Double amount) {
            Payments2 payments = new Payments2();

            if (balanceCheck.test(fromMobileNumber, amount) && dailyLimitCheck.test(fromMobileNumber, amount)) {
                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.getOrDefault(toNumber, 0.0);

                Double fromTotalBalance = fromAccountBalance - amount;
                Double toTotalBalance = toAccountBalance + amount;

                accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
                accountBalanceMap.put(toNumber, toTotalBalance);

                TransactionTracker tracker = dailyTransactionMap.get(fromMobileNumber);
                if (tracker != null) {
                    tracker.recordTransaction(amount);
                }

                payments.setStatus(PaymentStatus.Completed.getMessage());
            } else {
                payments.setStatus(PaymentStatus.failed.getMessage());
            }

            payments.setTxnId(UUID.randomUUID().toString());
            payments.setDate(new Date());
            payments.setUtrId(UUID.randomUUID().toString());

            return payments;
        }


            }



