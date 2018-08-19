package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

public class Smart_security_camera extends Host_device {

    private static float elecCost = 10;
    public boolean on;


    public void startFilming() {

        System.out.println("Camera started filming");

    }

    public void stopFilming() {
        System.out.println("Camera stoped filming");
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
