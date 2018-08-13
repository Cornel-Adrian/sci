package main.java.ro.sci;

public abstract class Host_device {


    int elec_comsumption = 0;

    public abstract boolean turnOn();
    public abstract boolean turnOff();

    public int getElec_comsumption() {
        return elec_comsumption;
    }
}
