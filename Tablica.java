package SDA;

public class Tablica {
    public static void main(String[] args) {

        int[] wartosci = new int [10];
        for (int i = 0; i <10; i++) {
                wartosci[i]=i+1;
        }

        for (int wartosc: wartosci) {
            System.out.println("Elementy tablicy " + wartosc);
        }

    }
}
