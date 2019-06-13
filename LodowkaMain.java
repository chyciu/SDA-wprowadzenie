package SDA;

public class LodowkaMain {

    public static void main(String[] args) {

        Lodowka lodowkaDarka = new Lodowka();

        lodowkaDarka.on();

        String[] stringi = { new String("Jakiś napis"), "Jakiś napis"};

        Object[] obiekty = {
                new Object(),
                new String("Jakiś napis"),
                new Produkt("pomidor", true)
        };


        lodowkaDarka.ustawTemperature();
        lodowkaDarka.ustawTemperature();

    }
}
