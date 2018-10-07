package com.sci.festival;

public class FestivalStatistics implements Runnable {

    private FestivalGate gate = new FestivalGate();

    public FestivalStatistics(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(gate.getCountAll()+ " people have entered");
        System.out.println(gate.getCountFree() +" have free passes");
        System.out.println(gate.getCountFull() + " have full passes");
        System.out.println(gate.getCountFullVIP()+ " have full VIP passes");
        System.out.println(gate.getCountOneDay() + " have day passes");
        System.out.println(gate.getCountOneDayVIP() + " have VIP day passes");
    }
}
