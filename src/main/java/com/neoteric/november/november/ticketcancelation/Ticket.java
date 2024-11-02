package com.neoteric.november.november.ticketcancelation;

import java.time.LocalDate;

public class Ticket {

    private LocalDate journeyDate;
    private double ticketPrice;
    private boolean isCanceled;

    public Ticket(LocalDate journeyDate, double ticketPrice, boolean isCanceled) {
        this.journeyDate = journeyDate;
        this.ticketPrice = ticketPrice;
        this.isCanceled = isCanceled;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }
}
