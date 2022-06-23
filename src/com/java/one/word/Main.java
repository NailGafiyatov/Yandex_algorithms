package com.java.one.word;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader("/Applications/newDirection/in.txt"));
        FileWriter writer = new FileWriter("out.txt")) {

            String s1 = reader.readLine();
            String s2 = reader.readLine();

            StringBuilder builder = new StringBuilder(s1);


            ArrayList<String> result = new ArrayList(s1.length());
            for (int a = 0; a < s1.length(); a++) {
                result.add("");
            }
            int g = 0;

            for (int j = 0; j < s2.length(); j++) {
                char ch = s2.charAt(j);
                if (s1.charAt(j) == ch) {

                    result.set(j, "correct");
                    builder.deleteCharAt(j - g);
                    g++;
                } else {

                    result.set(j, "absent");
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                if (result.get(i).equals("correct")) {
                    continue;
                }
                if (builder.indexOf(String.valueOf(ch)) < 0) {

                    result.set(i, "absent");
                } else {

                    result.set(i, "present");
                    builder.deleteCharAt(builder.indexOf(String.valueOf(ch)));
                }
            }

        for(String str : result) {
            writer.write(str + "\n");
            System.out.println(str);
        }


        }
    }
}
