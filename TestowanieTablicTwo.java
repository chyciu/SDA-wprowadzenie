package SDA;

import java.util.Random;

public class TestowanieTablicTwo {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random generator = new Random();

        for (int i = 0; i <= tablica.length-1; i++)
            tablica[i] = generator.nextInt(100);

        System.out.println("Podaj jak chcesz wyszukać dane: \n\n 1) Sprawdź index tabeli\n 2) Wyszukaj wartość\n");

        PobieraczDanych pd = new PobieraczDanych();
        int wybor = pd.pobierzInt();

        switch (wybor) {
            case 1:

                System.out.println("Podaj index który chcesz sprawdzić!");
                int index = pd.pobierzInt();

                int wartoscPodIndexem = tablica[index];

                System.out.println(String.format("Wartość pod indexem %d to %d", index, wartoscPodIndexem));
                break;

            case 2:
                System.out.println("Podaj liczbę do wyszukania: ");
                int value = pd.pobierzInt();

                TestowanieTablic testowanieTablic = new TestowanieTablic();
                if(testowanieTablic.contains(tablica, value)){
                    System.out.println(String.format("Liczba %d znaleziona!", value));
                } else {
                    System.out.println("Przykro nam ale liczby nie znaleziono!");
                }
                break;

            default:
                System.out.println("Zły wybór");
                break;
        }
    }


    public boolean contains(int[] array, int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }



}