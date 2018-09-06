package main.java.ro.sci;

import main.java.ro.sci.StringsTest.StringUtility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input);

        StringUtility stringUtility = new StringUtility(input);


    }


}
