package com.java.exam_intern.A;

import java.util.*;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        try(Scanner scanner = new Scanner(System.in)) {

            int sizeArray = scanner.nextInt();

            long[] arrayNumber = new long[sizeArray];
            String[] arrayString = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", " "};

            LongStream stream = Arrays.stream(arrayNumber);
            for (int x = 0; x < sizeArray; x++) {
                long number = scanner.nextLong();
                arrayNumber[x] = number;
            }
            long w = 0;
            long x = 0;

            for (int i = 0; i < sizeArray; i++) {
                x = arrayNumber[i] - w;
                double degree = log2(x);
                builder.append(arrayString[(int) degree]);
                w += Math.pow(2, degree);
            }
        }
        System.out.println(builder);
    }

    public static double log2(long x) {
        return Math.log(x) / Math.log(2);
    }
}
