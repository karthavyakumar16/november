package com.neoteric.november.november.polymorpisim2;

import java.util.Date;

public class Payments2 {
    private String txnId;
    private String utrId;
    private Date date;
    private Date time;
    private String status;

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
}

