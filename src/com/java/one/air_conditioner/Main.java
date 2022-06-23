package com.java.one.air_conditioner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");
        String mode = scanner.nextLine();

        int troom = Integer.parseInt(s[0]);
        int tcond = Integer.parseInt(s[1]);

        int result = 0;
        Arrays.sort(s);

        switch(mode) {
            case "freeze":
                if (troom < tcond) {
                    result = troom;
                } else {
                    result = tcond;
                }
                break;
            case "heat":
                if (troom > tcond) {
                    result = troom;
                } else {
                    result = tcond;
                }
                break;
            case "auto":
                result = tcond;
                break;
            case "fan":
                result = troom;
                break;
        }
        System.out.println(result);
    }
}
