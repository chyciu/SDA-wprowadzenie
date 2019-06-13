package SDA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaListaObecnosci {

    public static void main(String[] args) {
        Map<String,Integer> listaObecnosci = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        do {
            System.out.println("Podaj osobę: ");
            String osoba = scanner.nextLine();
            System.out.println("Podaj liczbę obecności: ");
            Integer liczbaObecnosci = Integer.valueOf(scanner.nextLine());
            if (listaObecnosci.containsKey(osoba)) {
                System.out.println("Osoba istnieje na liście!");
            } else {
                listaObecnosci.put(osoba, liczbaObecnosci);
            }
            System.out.println("Czy chcesz dodać kolejną osobę? Y/N: ");
            String czyKontynuowac = scanner.nextLine();
            if (czyKontynuowac.equalsIgnoreCase("N")) {
                flag = false;
            }
        }while (flag);

        boolean flag2 = true;

        do {
            System.out.println("Usuń osobę: ");
            String osobaDoUsuniecia = scanner.nextLine();
            if (!listaObecnosci.containsKey(osobaDoUsuniecia)) {
                System.out.println("Osoba nie istnieje!");
            } else {
                listaObecnosci.remove(osobaDoUsuniecia);
            }
            System.out.println("Czy chcesz usunąć kolejną osobę? Y/N: ");
            String czyKontynuowac = scanner.nextLine();
            if (czyKontynuowac.equalsIgnoreCase("N")) {
                flag2 = false;
            }
        }while (flag2);

        System.out.println("Osoby na liście: ");
        for(String osoba: listaObecnosci.keySet()) {
            System.out.println(osoba);
        }

        System.out.println("Obecności na liście: ");
        for(Map.Entry kluczWartosc : listaObecnosci.entrySet()) {
            System.out.println(String.format("Osoba: %s ma %d obecności", kluczWartosc.getKey(), kluczWartosc.getValue()));
        }

    }

}


