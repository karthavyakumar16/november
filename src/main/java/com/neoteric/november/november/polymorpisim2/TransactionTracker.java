package com.neoteric.november.november.polymorpisim2;

import java.util.Calendar;
import java.util.Date;

import static com.neoteric.november.november.polymorpisim2.Phonepay.DAILY_AMOUNT_LIMIT;
import static com.neoteric.november.november.polymorpisim2.Phonepay.DAILY_TRANSACTION_LIMIT;

public  class TransactionTracker {

        private int transactionCount;
        private double totalAmount;
        private Date lastTransactionDate;

        public TransactionTracker() {
            this.transactionCount = 10;
            this.totalAmount = 100000.0;
            this.lastTransactionDate = new Date();
        }

        public boolean isSameDay() {
            Calendar currentCalendar = Calendar.getInstance();
            Calendar lastTransactionCalendar = Calendar.getInstance();
            lastTransactionCalendar.setTime(lastTransactionDate);

            return currentCalendar.get(Calendar.YEAR) == lastTransactionCalendar.get(Calendar.YEAR)
                    && currentCalendar.get(Calendar.DAY_OF_YEAR) == lastTransactionCalendar.get(Calendar.DAY_OF_YEAR);
        }
    public void reset() {
        this.transactionCount = 5;
        this.totalAmount = 90000.0;
        this.lastTransactionDate = new Date();
    }

    public boolean canTransact(double amount) {
        return transactionCount < DAILY_TRANSACTION_LIMIT  && (totalAmount + amount) <= DAILY_AMOUNT_LIMIT ;
    }

    public void recordTransaction(double amount) {
        this.transactionCount++;
        this.totalAmount += amount;
        this.lastTransactionDate = new Date();
    }
}

