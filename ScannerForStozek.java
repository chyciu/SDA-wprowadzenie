package SDA;

import java.util.Scanner;

public class ScannerForStozek {


    public static void main(String[] args) {
        System.out.println("Podaj promień podstawy ztożka");

        Scanner input =new Scanner(System.in);
        int promien = input.nextInt();
        System.out.println("Podaj wysokość stożka: ");
        int wysokosc = input.nextInt();

        double rdo2 = Math.pow(promien, 2);

        System.out.println("Promien podtsawy " + promien);
        System.out.println("Wysokość stożka " + wysokosc);

        double v = 1.0/3.0 * Math.PI * rdo2 * wysokosc;
        System.out.println("Wynik: " + v);

    }
}
