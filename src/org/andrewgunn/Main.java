package org.andrewgunn;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void inputOutput() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a word>");
        String word = keyboard.nextLine();
        System.out.printf("You entered %s\n", word);
        System.out.print("Enter a #>");

        while (!keyboard.hasNextDouble()) {
            System.out.println("Enter valid number");
            keyboard.nextLine();
        }

        double num = Double.parseDouble(keyboard.nextLine());
        System.out.printf("You enterd %.2f", num);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter grade>");
        char grade = keyboard.nextLine().toUpperCase(Locale.ROOT).charAt(0);


        switch (grade) {
            case 'A' -> System.out.println("4 pts");
            case 'B' -> System.out.println("3 pts");
            case 'C' -> System.out.println("2 pts");
            case 'D' -> System.out.println("1 pts");
            default -> System.out.println("0 pts");
        }

    }
}
