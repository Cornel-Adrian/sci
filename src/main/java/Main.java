package main.java;

import main.java.company.Employee;
import main.java.company.Operations;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Employee> employees = null;
        ArrayList<Employee> employeesWithoutParkingSpot = null;
        ArrayList<Employee> managers = null;
        ArrayList<Employee> softwareEngineers = null;
        Operations ops = new Operations();
        ops.addEmployees(employees,10);
        ops.getListWithNoParkingSpot(employees, employeesWithoutParkingSpot);
        employeesWithoutParkingSpot.sort(Employee::compareTo);

        //to do print by role
        ops.getManagers(employees,managers);
        ops.getSoftwareEnginners(employees,softwareEngineers);

    }
}
