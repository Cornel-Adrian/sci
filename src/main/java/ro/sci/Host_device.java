package main.java.ro.sci;

public class Host_device {


    int elec_comsumption = 0;
    boolean turnOn;

    public boolean turnOn()
    {
       return turnOn = true;
    }
    public boolean turnOff()
    {
       return turnOn = false;
    }

    public int getElec_comsumption() {
        return elec_comsumption;
    }
}