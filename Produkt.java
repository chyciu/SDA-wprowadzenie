package SDA;

public class Produkt {

    private String nazwa;
    private boolean czyDoLodowki;

    public Produkt(String nazwa, boolean czyDoLodowki) {
        this.nazwa = nazwa;
        this.czyDoLodowki = czyDoLodowki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isCzyDoLodowki() {
        return czyDoLodowki;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
