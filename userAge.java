package SDA;

import java.util.Scanner;

public class userAge {

    public static void main(String[] args) {
        System.out.println("Hej, podaj rok urodzenia");

        Scanner input = new Scanner(System.in);

        int rok = input.nextInt();

        int obecnyRok = 2019;
        int wiek = obecnyRok - rok;

        if (wiek >= 18) {
            System.out.println("Gratulacje, możesz jeździć autem");
        }
        else {
            System.out.println("Musisz zostać w domu");
        }
    }
}
