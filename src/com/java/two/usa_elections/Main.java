package com.java.two.usa_elections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, Integer> map = new TreeMap<>();



        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");

            String name = s[0];
            int countVote = Integer.parseInt(s[1]);

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + countVote);
            } else {
                map.put(name, countVote);
            }
        }
        reader.close();
        getMap(map);
    }

    public static void getMap(TreeMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
