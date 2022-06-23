package com.java.two.number_before;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");

        Set<Integer> set = new HashSet<>();

        for (String string : s) {
            if (set.contains(Integer.parseInt(string))){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            set.add(Integer.parseInt(string));
        }
    }
}
