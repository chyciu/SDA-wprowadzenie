package SDA;

public class Lodowka {

    public static final String KOLOR = "czerwony";
    public static final String WYSOKOSC = "2m";
    public static final String szerokosc = "0.5";

    public static final float TEMP_MAX = 15;
    public static final float tempMin = 0;

    private float temperatura;
    private Produkt[] zawartosc;

    public void on() {
        System.out.println("Lodówka jest włączona");
    }

    public void off() {
        System.out.println("Lodówka wyłączona");
    }

    public void wyswietlTemperature() {
        System.out.println("Aktualna temperatura: " + getTemp());
    }

    public void ustawTemperature() {
        PobieraczDanych pd = new PobieraczDanych();
        System.out.println("Podaj temperaturę z którą ma pracować lodówka: ");
        float podanaTemp = (float) pd.pobierzInt();

        if (podanaTemp <= TEMP_MAX && podanaTemp >= tempMin) {
            setTemp(podanaTemp);
            System.out.println("Podano temperaturę: " + getTemp());
        } else {
            System.out.println(String.format("Podana temperatura %f nie spełnia wymagań", podanaTemp));
        }
    }

    public void wypakujZakupy(Produkt[] zakupy) {
        System.out.println("Wypakowanie zakupów");

        Produkt[] zawartoscDoLodowki = new Produkt[zakupy.length];

        for (int i = 0; i < zakupy.length; i++) {
            if(zakupy[i].isCzyDoLodowki()) {
                zawartoscDoLodowki[i] = zakupy[i] ;
            } else {
                zawartoscDoLodowki[i] = new Produkt("puste miejsce", true);
            }
        }

        setZawartosc(zawartoscDoLodowki);
        for (Produkt produkt : getZawartosc()) {
            System.out.println("Dodany produkt: " + produkt.getNazwa());
        }

    }

    private float getTemp() {
        return temperatura;
    }

    private void setTemp(float temperatura) {
        this.temperatura = temperatura;
    }

    private Produkt[] getZawartosc() {
        return zawartosc;
    }

    private void setZawartosc(Produkt[] zawartosc) {
        this.zawartosc = zawartosc;
    }
}
