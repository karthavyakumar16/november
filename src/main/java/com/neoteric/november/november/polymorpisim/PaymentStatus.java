package com.neoteric.november.november.polymorpisim;

public enum PaymentStatus {
    Completed(1,"paymentsucess"),
    failed(2,"paymentfailed"),
    FAILED_DAILY_LIMIT(3,"exceeddailylimit"),
    pending(4,"paymentpending");
   private   int code;
    private String message;
     PaymentStatus(int code,String message){
         this.code=code;
         this.message=message;
     }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
