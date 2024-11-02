package com.neoteric.november.november.ticketcancelation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancellationService {

    public double cancelTicket(LocalDate cancellationDate,LocalDate journeyDate,boolean isCanceled,double ticketPrice) {
        if (isCanceled) {
            System.out.println("Ticket already canceled.");
            return 0.0;
        }

        isCanceled = true;

        long daysBeforeJourney = ChronoUnit.DAYS.between(cancellationDate, journeyDate);

        if (daysBeforeJourney > 7) {
            System.out.println("Ticket canceled with full refund.");
            return ticketPrice;
        } else if (daysBeforeJourney == 0) {
            System.out.println("Ticket canceled on journey date. No refund.");
            return 0.0;
        } else {
            System.out.println("Ticket canceled less than a week before journey. Partial refund policy can be applied.");

            return 0.0;
        }
    }
}
