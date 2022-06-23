package com.java.two.tolya_karp2;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        TreeMap<Long, Long> map = new TreeMap<>();

        long color;
        long colorValue;

        for(int i = 0; i < count; i++) {
            color = scanner.nextLong();
            colorValue = scanner.nextLong();

            if (map.containsKey(color)) {
                map.put(color, map.get(color) + colorValue);
            } else {
            map.put(color, colorValue);
            }
        }
        scanner.close();
        getMap(map);
    }

    public static void getMap(TreeMap<Long, Long> map) {
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
