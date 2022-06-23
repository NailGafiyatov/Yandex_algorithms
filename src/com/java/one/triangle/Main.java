package com.java.one.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();

        if (t1 + t2 <= t3 || t2 + t3 <= t1 || t1 + t3 <= t2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
