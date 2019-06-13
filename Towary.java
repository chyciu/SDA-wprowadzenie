package SDA;

public class Towary {

    public final String nazwa;
    public final String typ;
    public final double cena;

    public final boolean czyPromocja;
    public final boolean czyMozliweRaty;

    public Towary(String nazwa, String typ, double cena, boolean czyPromocja, boolean czyMozliweRaty) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.cena = cena;
        this.czyPromocja = czyPromocja;
        this.czyMozliweRaty = czyMozliweRaty;
    }
}
