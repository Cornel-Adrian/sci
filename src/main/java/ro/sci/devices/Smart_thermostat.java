package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

import java.util.Scanner;

public class Smart_thermostat extends Host_device {

    public int temperature;
    public boolean on;
    private static float elecCost = 3;

    Scanner scanner = new Scanner(System.in);

    public void setTemperature() {
        this.temperature = scanner.nextInt();
    }


    public boolean turnOn() {
        this.elecCost = 3;
        return on = true;
    }


    public boolean turnOff() {
        this.elecCost = 0;
        return on = false;
    }

    public boolean isOn() {
        return on;
    }

}
