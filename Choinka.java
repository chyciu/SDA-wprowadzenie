package SDA;

import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        char znakGwiazdki = '*';

        System.out.print("Podaj ilosc poziomow choinki: \n");
        int poziomy = 8;

        for (int i = 0; i < poziomy; i++) {
            for (int j = 0; j < poziomy * 2; j++) {
                if (j < (poziomy - i) || j > (poziomy + i)) {
                    System.out.print("-");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }
    }
}