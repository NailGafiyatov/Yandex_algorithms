package com.java.two.six.A;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            int sizeArray = Integer.parseInt(scanner.nextLine());
            long[] array = new long[sizeArray];

            for (int x = 0; x < sizeArray; x++) {
                long number = scanner.nextLong();
                array[x] = number;
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));

            int countGet = scanner.nextInt();

            int countNumberInArray = 0;
            StringBuilder builder = new StringBuilder();
            HashMap<Integer, Long> list;

            for (int i = 0; i < countGet; i++) {
                long n1 = scanner.nextLong();
                long n2 = scanner.nextLong();
                long max = Math.max(n1, n2);
                long min = Math.min(n1, n2);
                for (int j = 0; j < sizeArray; j++) {
                    long numberFromArray = array[j];
                    if (numberFromArray <= max && numberFromArray >= min) {
                        countNumberInArray++;
                    }
                }
                builder.append(countNumberInArray + " ");
                countNumberInArray = 0;
            }
            System.out.println(builder);
        }
    }
}
