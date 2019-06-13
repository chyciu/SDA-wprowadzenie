package SDA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listy {

    public static void main(String[] args) {
        List<String> toDoList = new LinkedList<>();

        System.out.println("Witaj. Podaj 3 zadania do wykonania");


        Scanner scanner = new Scanner(System.in);

        for (int i=1; i <= 3; i++) {
            System.out.println(String.format("Podaj %d zadanie do wykonania", i));
            toDoList.add(scanner.nextLine());
        }

        System.out.println("Dodane zadania: ");

        System.out.println(toDoList);

        for (int i =0; i<toDoList.size(); i++) {
            System.out.println(String.format("Zadanie z listy: %s", toDoList.get(i)));
        }
    }
}
