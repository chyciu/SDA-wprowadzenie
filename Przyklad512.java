package SDA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Przyklad512 {
    public static void main(String[] args) {
        Przyklad512.test();
    }

    public static void test() throws Przyklad51Exception, InputMismatchException {
        int tablica[] = {5, 4, 3, 2, 1};

        System.out.println("Podaj indeks tablicyyyyyyyyy, który 		chcesz zobaczyć: ");
        int index;
        System.out.println("fffffffffff");
        boolean flag;
        do {
            flag = false;
            index = Przyklad512.getInt();

            try {
                System.out.println(tablica[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("aaaaaaaaaaaa");
                flag = true;
            } catch (Exception e) {
                flag = true;
                System.out.println("General exception");
            }
        } while (flag);
    }

    public static int getInt() {
        int index = -1;
        Scanner inputScanner = new Scanner(System.in);
        try {
            index = inputScanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Błędna wartość, spróbuj ponownie!");
        }
        return index;
    }

}