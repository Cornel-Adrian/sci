package main.java.ro;

import main.java.ro.functions.Calculator;

import java.util.Scanner;

public class Main {

    public static void Main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Introduceti 2 numere pentru operatii");

        Scanner scanner = new Scanner(System.in);
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        calculator.calculeaza(nr1, nr2);

        System.out.println("Introduceti luna in cifre");

        int luna = scanner.nextInt();
        System.out.println("Introduceti anul");
        int an = scanner.nextInt();

        main.java.ro.functions.NumarZile.calculLuna(luna, an);

    }
}
