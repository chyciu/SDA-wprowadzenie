package SDA;

import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Czas {

    public static void main(String[] args) {
        ZonedDateTime dataCzas = ZonedDateTime.now();
        ZonedDateTime dataCzas2 = dataCzas.minus(Period.ofDays(2));
        ZonedDateTime dataCzas3 = dataCzas.plus(Period.ofDays(3));

        System.out.println(dataCzas);
        System.out.println(dataCzas2);
        System.out.println(dataCzas3);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst = dataCzas.format(f);
        System.out.println(tekst);

        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy MM dd");
        String tekst2 = dataCzas.minus(Period.ofDays(2)).format(a);
        System.out.println(tekst2);
    }
}
