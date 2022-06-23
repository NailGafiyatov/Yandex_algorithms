package com.java.two.number_of_matching;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s1 = scanner.nextLine().split(" ");
        String[] s2 = scanner.nextLine().split(" ");

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (String string: s1) {set1.add(Integer.parseInt(string));}
        for (String string: s2) {set2.add(Integer.parseInt(string));}

        getCount(set1,set2);
    }

    public static void getCount(Set<Integer> set1, Set<Integer> set2) {
        Iterator iterator1 = set1.iterator();
        Iterator iterator2 = set2.iterator();

        int count = 0;
        while (iterator1.hasNext() && iterator2.hasNext()) {
            if (set2.contains(iterator1.next())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
