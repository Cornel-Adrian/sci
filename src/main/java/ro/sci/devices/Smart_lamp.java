package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

import java.util.Scanner;

public class Smart_lamp extends Host_device implements lamp {

    Scanner scanner = new Scanner(System.in);


    @Override
    public int setBrightness() {
        int brightness = ((scanner.nextInt()) );
        return brightness;

    }

    @Override
    public String setColor() {
        return null;
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
