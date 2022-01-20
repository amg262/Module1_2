package org.andrewgunn;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);

        List<String> toDoList = new ArrayList<>();
        String input = "";

        while (!input.toUpperCase().equals("DONE")) {
            System.out.print("Enter a TO DO list item or DONE>");
            input = keyboard.nextLine();

            if (!input.equalsIgnoreCase("DONE")) toDoList.add(input);
        }

        for (String todo : toDoList) System.out.println(todo);

//        int j = Integer.parseInt(keyboard.nextLine());
//        countUp(j);
    }


    public static void toDoList() {
        Scanner keyboard = new Scanner(System.in);

        List<String> toDoList = new ArrayList<>();
        String input = "";

        while (!input.toUpperCase().equals("DONE")) {
            System.out.print("Enter a TO DO list item or DONE>");
            input = keyboard.nextLine();

            if (!input.equalsIgnoreCase("DONE")) toDoList.add(input);
        }

        for (String todo : toDoList) System.out.println(todo);
    }
    public static void countUp(int max) {


        if (max > 10 || max < 0) {
            System.err.println("Error: 1 to 10 only");
        } else {
            for (int i = 0; i <= max; i++) {
                System.out.printf("# %d\n", i);
            }
        }
    }

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


    public static void switchStatements() {
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


    public static void arraysArrayList() {
        Scanner keyboard = new Scanner(System.in);

        String names[] = new String[5];
        names[0] = "Brittney";
        names[1] = "Stacy";
        names[2] = "Matt";
        names[3] = null;

        for (String name : names) {
            if (name == null) continue;
            System.out.println(name);
        }


        List<String> nameList = new ArrayList<>();
        nameList.add("Andy");
        nameList.add("Gunn");
        nameList.add("Odie");

        for (String i : nameList) {
            System.out.printf("%s", i);
        }
    }

}
