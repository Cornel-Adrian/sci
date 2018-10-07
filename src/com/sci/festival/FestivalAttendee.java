package com.sci.festival;

public class FestivalAttendee implements Runnable {

    private FestivalGate gate = new FestivalGate();
    private TicketType ticket;

    public FestivalAttendee(TicketType ticket, FestivalGate gate) {
        this.gate = gate;
        this.ticket = ticket;
    }


    @Override
    public void run() {
        gate.addTicket(ticket);
    }
}
