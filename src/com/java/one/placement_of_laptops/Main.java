package com.java.one.placement_of_laptops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();

        int table1 = (a1 + a2) * Math.max(b1, b2);
        int table2 = (b1 + b2) * Math.max(a1, a2);
        int table3 = (a1 + b2) * Math.max(b1, a2);
        int table4 = (b1 + a2) * Math.max(a1, b2);

//        int table1 = (Math.max(a1, a2) + Math.min(b1, b2)) * Math.min(a1, a2);
//        //System.out.println(table1 + " " + table2 + " " + table3 + " " + table4);
//        System.out.println(table1);

        int minSizeTable = Math.min(Math.min(Math.min(table1, table2), table3), table4);
        //System.out.println(minSizeTable);

        System.out.println(minSizeTable / Math.max(b1, b2) + " " + Math.max(b1, b2));
    }
}
