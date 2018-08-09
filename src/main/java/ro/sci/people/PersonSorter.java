package main.java.ro.sci.people;

public class PersonSorter {

    public void sortByAge(Person[] peps) {

        for (int i = 0; i < peps.length; i++) {
            for (int j = 0; j < peps.length; j++) {
                if ((peps[j].getAge()) > (peps[j + 1].getAge())) {
                    Person swap = peps[j];
                    peps[j] = peps[j + 1];
                    peps[j + 1] = swap;

                }
            }
        }
    }

}
