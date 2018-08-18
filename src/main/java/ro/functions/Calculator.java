package main.java.ro.functions;

import java.util.Scanner;

public class Calculator {


    public Calculator() {
    }

    public void calculeaza(int x, int y) {
        System.out.println("Scrieti ce operatie doriti sa realizati: adunare, scadere, inmultire sau impartire");
        Scanner scanner = new Scanner(System.in);
        String alegere = scanner.nextLine();


        switch ( alegere ) {


            case "adunare":
                System.out.println(x + y);
                break;


            case "scadere":
                System.out.println(x - y);
                break;


            case "inmultire":
                System.out.println(x * y);
                break;


            case "impartire":
                System.out.println(x / y);
                break;

            default:
                System.out.println("Greseala");
        }

    }
}
