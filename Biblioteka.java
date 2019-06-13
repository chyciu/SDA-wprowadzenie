package SDA;

public class Biblioteka {

    public Ksiazka[] polkaKsiazek;

    public void setPolkaKsiazek(Ksiazka[] polkaKsiazek) {
        this.polkaKsiazek = polkaKsiazek;
    }

    public void wyswietlKsiazki() {
        for (int i = 0; i < polkaKsiazek.length; i++) {
            System.out.println(String.format("Autor: %s, tytuł: %s, rok wydania; %s",
                    polkaKsiazek[i].getAutor(),
                    polkaKsiazek[i].getTytul(),
                    polkaKsiazek[i].getRokWydania()));
        }
    }

    public void wyswietlKsiazkiExtended() {
        for (int i = 0; i < polkaKsiazek.length; i++) {
            System.out.println(String.format("Autor: %s, tytuł: %s, rok wydania; %s, numerISBN: %s, gatunek %s",
                    polkaKsiazek[i].getAutor(),
                    polkaKsiazek[i].getTytul(),
                    polkaKsiazek[i].getRokWydania(),
                    polkaKsiazek[i].getNumerISBN(),
                    polkaKsiazek[i].getGatunek()));
        }
    }

    public Ksiazka createBook(String autor, String rokWydania, String tytul) {
        return new Ksiazka(autor, rokWydania, tytul);
    }

}


