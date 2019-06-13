package SDA;

import java.util.Scanner;

public class PobieraczDanych {

    public int pobierzInt() {
        System.out.println("Podaj liczbę");
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();
    }
}
