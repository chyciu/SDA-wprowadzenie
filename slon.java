package SDA;

import java.util.Scanner;

public class slon {

    public static void main(String[] args) {
        System.out.println("Jakie to zwierzę?");

        Scanner input = new Scanner(System.in);

        String zwierze = input.nextLine();

        switch (zwierze) {
            case "Słoń":
                System.out.println("Hej, jestem słoń");
                break;
            case "Kot":
                System.out.println("Hej, jestem kot");
                break;
            default:
                System.out.println("Brak pomysłu");
        }
    }


}