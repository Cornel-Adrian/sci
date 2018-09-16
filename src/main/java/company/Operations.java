package main.java.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Operations {


    public ArrayList<Employee> addEmployees(ArrayList<Employee> employees, int nr) {

        Employee testNull = null;
        for (int i = 0; i < nr; i++) {
            employees.add(parseEmployee(testNull));
        }
        return employees;
    }


    private Employee parseEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        String setName = scanner.next();
        Integer setAge = scanner.nextInt();

        employee = new Employee(setName, setAge, setParking(), hiringDate(),setRole());

        return employee;

    }

    private char setParking() {

        char a;
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Does this person have parking? Please answer with yes or no");
        if (answer == "yes") {
            return a = 'y';
        }
        if (answer.equals("no")) {
            return a = 'n';
        }
        return setParking();
    }

    private String setRole() {

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Is this person a manager or a software engineer? Please answer with one of the two");
        if (answer == "manger") {
            return answer = "manager";
        }
        if (answer.equals("software engineer")) {
            return answer = "software engineer";
        }
        return setRole();
    }

    private Date hiringDate() {
        Scanner scanner = new Scanner(System.in);
        Date hireDate = new Date(String.valueOf(scanner));

        return hireDate;

    }


    public ArrayList<Employee>  getListWithNoParkingSpot(ArrayList<Employee> employees, ArrayList<Employee> employeesWithoutParkingSpot)
    {
        int j =0;
        Employee testNull = null;
        for (int i = 0 ; i < employees.size();i++)
        {
            if (employees.get(i).getParking()=='n')
            {
                testNull = employees.get(i);
                employeesWithoutParkingSpot.add(testNull);
            }
        }

        return employeesWithoutParkingSpot;
    }


    public ArrayList<Employee> getManagers(ArrayList<Employee> employees, ArrayList<Employee> managers) {
        Employee testNull = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getRole() == "manager")
            testNull = employees.get(i);
            managers.add(parseEmployee(testNull));
        }

        System.out.println(managers);
        return managers;
    }


    public ArrayList<Employee> getSoftwareEnginners(ArrayList<Employee> employees, ArrayList<Employee> softwareEngineers) {
        Employee testNull = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getRole() == "software engineer")
                testNull = employees.get(i);
            softwareEngineers.add(parseEmployee(testNull));
        }
        System.out.println(softwareEngineers);

        return softwareEngineers;
    }
}
