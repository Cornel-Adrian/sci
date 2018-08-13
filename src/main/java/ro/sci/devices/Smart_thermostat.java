package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

public class Smart_thermostat extends Host_device implements thermostat {

    public int setTemperature() {
        return 0;
    }


    @Override
    public boolean turnOn() {
        return true;
    }

    @Override
    public boolean turnOff() {
        return false;
    }
}
