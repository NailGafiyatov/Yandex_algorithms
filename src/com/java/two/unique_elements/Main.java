package com.java.two.unique_elements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (String string : s) {
            list.add(Integer.parseInt(string));
        }
        System.out.println(list);
        int n = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    n++;
                }
                if (j == s.length - 1 && n == 1) {
                    set.add(Integer.parseInt(s[i]));
                    n = 0;
                } else if(n >= 2){
                    n = 0;
                }
            }
        }
        System.out.println(set);
    }
}
