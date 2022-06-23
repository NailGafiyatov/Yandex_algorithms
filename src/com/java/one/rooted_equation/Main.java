package com.java.one.rooted_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = (int)((Math.pow(c, 2) - b) / a);

        System.out.println(x);
    }
}
