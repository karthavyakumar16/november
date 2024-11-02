package com.neoteric.november.november.polymorpisim;

import java.util.Date;

public class Payments {
    private String txnId;
    private String utrId;
    private Date date;
    private Date time;
    private String status;
    private Double amount;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getUtrId() {
        return utrId;
    }

    public void setUtrId(String utrId) {
        this.utrId = utrId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
