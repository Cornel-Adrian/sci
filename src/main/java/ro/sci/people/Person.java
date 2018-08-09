package main.java.ro.sci.people;

public class Person {

    String first_name;
    String last_name;
    int age;


    public int getAge() {
        return age;
    }


    public Person person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;

        return null;
    }




}


