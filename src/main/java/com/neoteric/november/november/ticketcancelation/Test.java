package com.neoteric.november.november.ticketcancelation;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate journeyDate = LocalDate.of(2024, 11, 15);
        Ticket ticket = new Ticket(journeyDate, 100.0,);  // Ticket price: $100
CancellationService cancellationService=new CancellationService();
        // Test case: Cancel 10 days before the journey
        LocalDate cancelDate1 = LocalDate.of(2024, 11, 5);
        double refund1 = ticket.cancelTicket(cancelDate1);
        System.out.println("Refund amount: $" + refund1);

        // Test case: Cancel on the journey date
        LocalDate cancelDate2 = journeyDate;
        double refund2 = ticket.cancelTicket(cancelDate2);
        System.out.println("Refund amount: $" + refund2);
    }
    }
}
