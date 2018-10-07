package com.sci.festival;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TicketType {
    full, fullVip, freePass, oneDay, oneDayVip;


    @Override
    public String toString() {
        return super.toString();
    }

    public static final List<TicketType> TICKET_TYPES = Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = TICKET_TYPES.size();
    public static final Random RANDOM = new Random();

    public static TicketType randomTicket(){

        return TICKET_TYPES.get(RANDOM.nextInt(SIZE));
    }

}

