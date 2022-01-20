package org.andrewgunn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a word>");
        String word = keyboard.nextLine();
        System.out.printf("You entered %s", word);

    }
}
