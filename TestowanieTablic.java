package SDA;

public class TestowanieTablic {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        for (int i = 0; i < 10; i++) {
            tablica[i] = i + 1;
        }

        System.out.println("Podaj liczbe do wyszukania: ");

        PobieraczDanych pd = new PobieraczDanych();

        int value = pd.pobierzInt();

        TestowanieTablic testowanieTablic = new TestowanieTablic();

        if (testowanieTablic.contains(tablica, value)) {
            System.out.println(String.format("Liczba %d znaleziona!", value));
        } else {
            System.out.println("Przykro nam ale liczby nie znaleziono!");
        }
    }

    public boolean contains(int[] array, int v) {

        boolean result = false;

        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }

        return result;
    }
}
