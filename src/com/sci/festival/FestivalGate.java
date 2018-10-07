package com.sci.festival;

import java.util.PriorityQueue;

public class FestivalGate {

    private int countAll = 0;
    private int countFull = 0;
    private int countFullVIP = 0;
    private int countFree = 0;
    private int countOneDay = 0;
    private int countOneDayVIP = 0;

    private PriorityQueue<TicketType> queue = new PriorityQueue<TicketType>();
    private TicketType ticketType;


    public void addTicket(TicketType ticket){
        queue.add(ticket);
        countAll += 1;

        if ("full".equals(ticket.toString())) {
            countFull += 1;
        }
        if ("fullVip".equals(ticket.toString())) {
            countFullVIP += 1;
        }
        if ("freePass".equals(ticket.toString())) {
            countFree += 1;
        }
        if ("oneDay".equals(ticket.toString())) {
            countOneDay += 1;
        }
        if ("oneDayVip".equals(ticket.toString())) {
            countOneDayVIP += 1;
        }
        queue.remove(ticket);
    }


    public int getCountFull() {
        return countFull;
    }

    public int getCountFullVIP() {
        return countFullVIP;
    }

    public int getCountFree() {
        return countFree;
    }

    public int getCountOneDay() {
        return countOneDay;
    }

    public int getCountOneDayVIP() {
        return countOneDayVIP;
    }

    public int getCountAll() {
        return countAll;
    }
}
