package SDA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrzykladWyjatku2 {


    public static void main(String[] args) {
        int tablica[] = {5, 4, 3, 2, 1};

        boolean zle = true;
        do {

            PrzykladWyjatku2.showIndex(tablica);
        } while (showIndex(tablica)==false);
    }

    public static boolean showIndex(int[] tab) {
        boolean zle = true;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
        int index = 0;
        try {
            index = inputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nieprawidlowa wartosc");
            zle = true;
        }
        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wyszedłeś poza zakres");
            zle = true;
        }
        return  false;

    }


}
