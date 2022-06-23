package com.java.one.ambulance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");

        double K1 = Integer.parseInt(s[0]); //номер квартиры для вызова скорой помощи
        double M = Integer.parseInt(s[1]);  //количество этажей
        double K2 = Integer.parseInt(s[2]); //номер квартиры предыдущего вызова
        double P2 = Integer.parseInt(s[3]); //номер подъезда предыдущего вызова
        double N2 = Integer.parseInt(s[4]); //номер этажа предыдущего вызова

        int countFlatInFloor =  (int)Math.ceil(K2 / (N2 + (M * (P2 - 1))));
        int countFlatInEntrance = (int) (countFlatInFloor * M);
        int P1 = (int) Math.ceil(K1 / countFlatInEntrance);
        int  N1 = 0;
        if (P1 > 1) {
            N1 = (int) Math.ceil((K1 - countFlatInEntrance * (P1 - 1)) / countFlatInFloor);
        } else {
            N1 = (int) Math.ceil(K1 / countFlatInFloor);
        }
//        System.out.println(countFlatInFloor);
//        System.out.println(countFlatInEntrance);
        System.out.println(P1);
        System.out.println(N1);
    }
}
