package SDA;

import java.util.Scanner;

public class Imie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();

        if(endsWith(imie, "a")) {
            System.out.println(String.format("Podane imię: %s prawdopodobnie jest imieniem damskim!", imie));
        } else {
            System.out.println(String.format("Podane imię: %s prawdopodobnie nie jest imieniem damskim", imie));
        }

        sprawdzWielkoscLitery(imie, 0);
    }

    public static void sprawdzWielkoscLitery(String imie, int numerLitery) {
        Character litera = imie.charAt(numerLitery);
        String pierwszaLitera = String.valueOf(litera);
        if (pierwszaLitera.equals(pierwszaLitera.toLowerCase())){
            System.out.println(String.format("Litera na indeksie %d jest pisana z małej litery!", numerLitery));
        } else {
            System.out.println(String.format("Litera na indeksie %d jest pisana z Wielkiej litery!", numerLitery));
        }
    }

    public static boolean endsWith(String imie, String literaDoSprawdzenia) {
        return String.valueOf(imie.charAt(imie.length()-1)).equalsIgnoreCase(literaDoSprawdzenia);
    }


}
