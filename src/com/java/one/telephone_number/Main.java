package com.java.one.telephone_number;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String regex = "[^0-9]";

        String newNumber = scanner.nextLine().replaceAll(regex, "");

        String newNumber11 = newNumber.substring(1, 10);
        String newNumber7 = newNumber.substring(4, 10);

        for (int i = 1; i < 4; i++) {
            String number = scanner.nextLine().replaceAll(regex, "");
            if ((number.length() == 11 &&
                    newNumber11.equals(number.substring(1, 10))) ||
                    (number.length() == 7 &&
                            newNumber7.equals(number.substring(0, 6)))) {
                out.write("YES\n");
            } else {
                out.write("NO\n");
            }
        }
        scanner.close();
        out.close();
    }
}

//        String n2 = scanner.nextLine().replaceAll(regex, "");
//        String n3 = scanner.nextLine().replaceAll(regex, "");
//        String n4 = scanner.nextLine().replaceAll(regex, "");
//
//        ArrayList<String> numbers = new ArrayList<>(4);
//        numbers.add(newNumber);
//        numbers.add(n2);
//        numbers.add(n3);
//        numbers.add(n4);
