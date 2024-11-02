package com.neoteric.november.november.polymorpisim2;

import com.neoteric.november.november.polymorpisim.Payments;

public interface UPIPayments {
    Payments2 transfer(String fromMobileNumber, String toNumber, Double amount);
}


