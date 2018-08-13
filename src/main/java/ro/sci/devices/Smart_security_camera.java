package main.java.ro.sci.devices;

import main.java.ro.sci.Host_device;

public class Smart_security_camera extends Host_device implements camera {
    @Override
    public void startFilming() {

        System.out.println("Camera started filming");

    }

    @Override
    public void stopFilming() {
        System.out.println("Camera stoped filming");
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
