package SDA;

public class Ksiazka {

    private String tytul;
    private String autor;
    private String rokWydania;

    private String numerISBN;
    private String gatunek;

    public Ksiazka (String tytul, String autor, String rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getRokWydania() {
        return rokWydania;
    }

    public Ksiazka (String tytul, String autor, String rokWydania, String numerISBN, String gatunek) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.numerISBN = numerISBN;
        this.gatunek = gatunek;
    }

    public String getNumerISBN() {
        return numerISBN;
    }

    public String getGatunek() {
        return gatunek;
    }
}
