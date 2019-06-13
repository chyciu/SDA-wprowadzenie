package SDA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TowaryMain {

    public static void main (String[]args){
            List<Towary> towary = Arrays.asList(
                    new Towary("Lodowka Bosh", "lodowka", 1000, true, false),
                    new Towary("Pralka Whirpool", "pralka", 1200, true, true),
                    new Towary("Kuchenka Gazpol", "kuchenka", 1800, true, true),
                    new Towary("Lodowka Gorenie", "lodowka", 8000, false, true),
                    new Towary("Pralka Polar", "pralka", 200, false, true),
                    new Towary("Kuchenka Indesit", "kuchenka", 500, false, true));

            System.out.println("Witaj, czego szukasz?");
            System.out.println("Podaj typ poszukiwanego produktu: ");

            Scanner scanner = new Scanner(System.in);
            String typ = scanner.nextLine();

        towary.stream()
                .filter(t -> t.typ.equals(typ))
                .map(t -> t.nazwa.toUpperCase())
                .forEach(System.out::println);
        }
 }

