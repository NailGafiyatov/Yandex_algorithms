package com.java.one.is_the_list_growing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        Set<String> answer = isGrow(strings);

        if (strings.length < 2) {
            System.out.println("NO");
        } else if (answer.size() == 1 && answer.contains("YES")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static Set<String> isGrow(String[] strings) {
        Set<String> answer = new HashSet<>();
        for (int i = 1; i < strings.length; i++) {
            if (Integer.parseInt(strings[i - 1]) < Integer.parseInt(strings[i])) {
                answer.add("YES");
            } else {
                answer.add("NO");
            }
        }
        return answer;
    }
}
