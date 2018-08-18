package main.java.ro.functions;

public class NumarZile {

    public static void calculLuna(int nr_luna, int an) {
        switch ( nr_luna ) {

            case 1:
                System.out.println("Luna este Ianuarie si are 31 de zile");
                break;
            case 2:
                if ((an % 400 == 0) || ((an % 4 == 0) && (an % 100 != 0))) {
                    System.out.println("Luna este Februarie si are 29 de zile");
                } else {
                    System.out.println("Luna este Februarie si are 28 de zile");
                }
                break;
            case 3:
                System.out.println("Luna este Martie si are 31 de zile");
                break;
            case 4:
                System.out.println("Luna este Aprilie si are 30 de zile");
                break;
            case 5:
                System.out.println("Luna este Mai si are 31 de zile");
                break;
            case 6:
                System.out.println("Luna este Iunie si are 30 de zile");
                break;
            case 7:
                System.out.println("Luna este Iulie si are 31 de zile");
                break;
            case 8:
                System.out.println("Luna este August si are 31 de zile");
                break;
            case 9:
                System.out.println("Luna este Septembrie si are 30 de zile");
                break;
            case 10:
                System.out.println("Luna este Octombrie si are 31 de zile");
                break;
            case 11:
                System.out.println("Luna este Noiembrie si are 30 de zile");
                break;
            case 12:
                System.out.println("Luna este Decembire si are 31 de zile");
                break;

            default:
                System.out.println("Numar de luna gresit");
        }

    }
}
