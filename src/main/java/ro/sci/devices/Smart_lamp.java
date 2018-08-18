package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

import java.util.Scanner;

public class Smart_lamp extends Host_device implements electricity {

    private static float elecCost = 5;
    public boolean on = false;

    String color;

    Scanner scanner = new Scanner(System.in);

    public int setBrightness() {
        int brightness = ((scanner.nextInt()));
        return brightness;

    }

    public String setColor() {
        this.color = new String(scanner.next());
        return color;
    }

    public Boolean turnOn() {
        elecCost = 5;
        return on = true;
    }

    public Boolean turnOff() {
        elecCost = 0;
        return on = false;
    }

    public boolean isOn() {
        return on;
    }
}
