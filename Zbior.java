package SDA;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {

    public static void main(String[] args) {
        //Tworzymy zmienną o typie interfejsu i inicjalizujemy:
        Set<String> osoby = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        do {
            System.out.println("Dodaj osobę do zbioru: ");
            osoby.add(scanner.nextLine());
            System.out.println("Czy chcesz dodać kolejną osobę? Y/N: ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag = false;
            }
        }while (flag);

        boolean flag2 = true;

        do {
            System.out.println("Usuń osobę do zbioru: ");
            String osobaDoUsunięcia = scanner.nextLine();
            if (!osoby.contains(osobaDoUsunięcia)) {
                System.out.println("Osoba nie istnieje!");
            } else {
                osoby.remove(osobaDoUsunięcia);
            }
            System.out.println("Czy chcesz usunąć kolejną osobę? Y/N: ");
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag2 = false;
            }
        }while (flag2);


        for(String imie: osoby) {
            System.out.println(imie);
        }

    }

}

