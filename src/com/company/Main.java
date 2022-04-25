package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Check the text "Java". Get the data from a user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text:");

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(input);

        String a = "Java";

        if (matcher.find()) {
            System.out.println("Found Java");
        }
        if (a.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
        if (a.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
        if (a == "Java") {
            System.out.println("Equals Java");
        }
        System.out.println(input.indexOf(input));

        //Check the text "A java course from scratch is the best way to learn Java". get a data from a user

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a text:");

        String input1 = scanner1.nextLine();

        Pattern pattern1 = Pattern.compile("Java");
        Matcher matcher1 = pattern1.matcher(input1);

        String string = "Java";

        if (matcher1.find()) {
            System.out.println("Found Java");
        }
        if (string.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
        System.out.println(input1.indexOf("Java"));
    }
}



