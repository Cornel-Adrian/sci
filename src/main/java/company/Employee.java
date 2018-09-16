package main.java.company;


import java.util.Date;

public class Employee {

    private String name;
    private int age;
    private char parking;
    private Date hireDate;
    private String role;


    public Employee(String name, int age, char parking, Date hireDate, String role) {
        this.name = name;
        this.age = age;
        this.parking = parking;
        this.hireDate = hireDate;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getParking() {
        return parking;
    }

    public void setParking(char parking) {
        System.out.println();
        this.parking = parking;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", parking=" + parking +
                ", hireDate=" + hireDate +
                ", role='" + role + '\'' +
                '}';
    }


    public int compareTo(Employee o) {
        return getHireDate().compareTo(o.getHireDate());
    }
}
