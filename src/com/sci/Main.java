package com.sci;

import com.sci.festival.FestivalAttendee;
import com.sci.festival.FestivalGate;
import com.sci.festival.FestivalStatistics;
import com.sci.festival.TicketType;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Main implements Runnable {

    private static TicketType ticket;
    private static FestivalGate gate = new FestivalGate();
    private static FestivalStatistics statistics = new FestivalStatistics(gate);

    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {

                    for (int j = 0 ; j <100 ; j ++){
                        Runnable f1 = new FestivalAttendee(ticket.randomTicket(),gate);
                        Thread t1 = new Thread(f1);
                        t1.run();
                    }

                    statistics.run();
                }
            }, 30000 * i);
        }


    }
}
