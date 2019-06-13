package SDA;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Przyklad51{
    public static void main(String[] args){
        Przyklad51.test();
    }

    public static void test() throws Przyklad51Exception, InputMismatchException {
        int tablica[] = {5,4,3,2,1};
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
        boolean czyElementNiePodany = true;
        int index = -1;

        while (czyElementNiePodany) {
            System.out.println("Podaj wartość indeksu!: ");

            index = Przyklad51.getInt();

            try {
                System.out.println(String.format("Podany wartość dla indexu %d to %d", index, tablica[index]));
                if (!(index == -1)) {
                    index = getInt();
                    czyElementNiePodany = false;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(String.format("Index %d poza zakresem! Spróbuj ponownie", index));
            }

        }
    }

    public static int getInt() {
        Scanner inputScanner = new Scanner(System.in);
        int index = -1;
        try {
            index = inputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Błędna wartość, spróbuj ponownie!");
        }
        return index;
    }

}