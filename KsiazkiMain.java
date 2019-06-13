package SDA;

public class KsiazkiMain {

    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();
        Ksiazka[] ksiazkas = {
                biblioteka.createBook("", "", ""),
                new Ksiazka("Jeden dzien życia", "R. Kapuściński", "1975"),
                new Ksiazka("My, dzieci z dworca Zoo", "Ch. Felscherinow", "1988"),
                new Ksiazka("Patria", "F. Aramburu", "2017"),
                new Ksiazka("Patrias", "F. Aram", "2014", "333553", "kryminał")
        };

        biblioteka.setPolkaKsiazek(ksiazkas);
        biblioteka.wyswietlKsiazki();
        biblioteka.wyswietlKsiazkiExtended();
    }
}