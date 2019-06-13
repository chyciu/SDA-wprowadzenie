package SDA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class ZapisywniePlikow {

    public static void main(String[] args) throws FileNotFoundException {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Witaj w aplikacji do podawania wyników meczów :)");

            PrintWriter tekstowy = new PrintWriter("wynikMeczu.txt");
            for (int i = 0; i < 2; i++) {

                System.out.println("Podaj drużynę 1: ");
                String druzyna1 = scanner.nextLine();
                System.out.println("Podaj drużynę 2: ");
                String druzyna2 = scanner.nextLine();
                System.out.println(String.format("Podaj wynik %s", druzyna1));
                String wynik1 = scanner.nextLine();
                System.out.println(String.format("Podaj wynik %s", druzyna2));
                String wynik2 = scanner.nextLine();

                StringJoiner stringJoiner = new StringJoiner(" ");
                String rezultat = stringJoiner
                        .add(druzyna1)
                        .add(wynik1)
                        .add(":")
                        .add(wynik2)
                        .add(druzyna2).toString();

                System.out.println(rezultat);


                tekstowy.println(rezultat);
            }

            tekstowy.close();
        }

        private static void zapiszDoPliku(String nazwaPliku, String zawartosc) throws FileNotFoundException {
            PrintWriter tekstowy = new PrintWriter(nazwaPliku);
            tekstowy.println(zawartosc);
            tekstowy.close(); //Należy pamiętać o zamknięciu pliku!
        }
    }
