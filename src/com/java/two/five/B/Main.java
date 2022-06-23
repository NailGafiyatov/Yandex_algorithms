package com.java.two.five.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            int size = scanner.nextInt();

            long sum = 0;
            long numberNext;

            ArrayList<Long> listNumber = new ArrayList<>();
            ArrayList<Integer> listIndex = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                numberNext = scanner.nextLong();
                listNumber.add(numberNext);
                if (numberNext > 0) {
                    listIndex.add(i);
                }
            }
            for (int i = 1; i < listIndex.size(); i++) {
                if (listIndex.get(i) - listIndex.get(i - 1) == 1) {
                    sum += listNumber.get(listIndex.get(i));
                    sum += listNumber.get(listIndex.get(i - 1));
                }
            }
            System.out.println(sum);
        }
    }
}
