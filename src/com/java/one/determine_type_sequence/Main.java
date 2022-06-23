package com.java.one.determine_type_sequence;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMas = Integer.parseInt(scanner.nextLine());
        String[] mas = scanner.nextLine().split(" ");
        int x = Integer.parseInt(scanner.nextLine());

        Set<String> set = getNumbers(sizeMas, mas, x);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static Set<String> getNumbers(int sizeMas, String[] mas, int x) {
        Set<String> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        int difference = 0;
        int number = 1000;

        for (int i = 0; i < sizeMas; i++) {
            if ((number = Integer.parseInt(mas[i])) == x) {
                set.add(mas[i]);
            } else if (difference > Math.abs(x - number)) {
                difference = Math.abs(x - number);
            }
        }
        return set;
    }
}
