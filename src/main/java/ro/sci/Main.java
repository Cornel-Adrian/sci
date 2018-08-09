package main.java.ro.sci;

import main.java.ro.sci.people.Person;
import main.java.ro.sci.people.PersonSorter;

import javax.swing.*;

public class Main {

    private static int i;

    public static void main(String[] args) {
        Person[] people = new Person[40];


        int nr_persoane = Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul de persoane pe care il doriti "));


        for (i = 0; i < nr_persoane; i++) {


            String first_name = JOptionPane.showInputDialog("Introduceti prenumele");
            String last_name = JOptionPane.showInputDialog("Introduceti numele de familie:");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Introduceti varsta:"));

            people[i] = new Person().person(first_name, last_name, age);
        }



        PersonSorter ops2 = new PersonSorter();

        ops2.sortByAge(people);

        for (int i = 0; i < people.length; i++) {

            System.out.println(people[i]);

        }


    }

}
