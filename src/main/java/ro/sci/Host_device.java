package main.java.ro.sci;

import main.java.ro.sci.devices.Smart_lamp;
import main.java.ro.sci.devices.Smart_security_camera;
import main.java.ro.sci.devices.Smart_thermostat;

public class Host_device {


    private Smart_lamp[] smart_lamps = new Smart_lamp[10];
    private Smart_security_camera[] smart_security_cameras = new Smart_security_camera[10];
    private Smart_thermostat[] smart_thermostats = new Smart_thermostat[10];

    private int lampsCount = 0;
    private int camerasCount = 0;
    private int thermostatsCount = 0;


    public void addLamp(Smart_lamp lamp) {
        smart_lamps[lampsCount++] = lamp;
    }

    public void addCameras(Smart_security_camera camera) {
        smart_security_cameras[camerasCount++] = camera;
    }

    public void addThermostat(Smart_thermostat thermostat) {
        smart_thermostats[thermostatsCount++] = thermostat;
    }

    public float calculateElectricityCost() {
        float cost = 0;
        for (Smart_thermostat t : smart_thermostats) {
            cost += t.calculateElectricityCost();
        }

        for (Smart_lamp l : smart_lamps) {
            cost += l.calculateElectricityCost();
        }

        for (Smart_security_camera s : smart_security_cameras) {
            cost += s.calculateElectricityCost();
        }
        return cost;

    }

    public  void turnOnAll()
    {
        for (Smart_thermostat t : smart_thermostats) {
            t.turnOn();
        }

        for (Smart_lamp l : smart_lamps) {
           l.turnOn();
        }

        for (Smart_security_camera s : smart_security_cameras) {
            s.turnOn();
        }
    }

    public  void statusAll()
    {
        for (Smart_thermostat t : smart_thermostats) {
            t.isOn();
        }

        for (Smart_lamp l : smart_lamps) {
            l.isOn();
        }

        for (Smart_security_camera s : smart_security_cameras) {
            s.isOn();
        }
    }


}