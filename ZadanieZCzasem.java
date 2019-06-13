package SDA;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ZadanieZCzasem {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ZonedDateTime czas = ZonedDateTime.now();

        DateTimeFormatter a = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String czas1 = czas.format(a);
        System.out.println(czas1);

        System.out.println("Podaj datę w formacie yyyy-MM-dd");

        String localDate = scanner.nextLine();

        if(localDate.matches("([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")) {
            System.out.println(String.format("Podana data to: %s", localDate));

            String[] tablicaDaty = localDate.split("-");

            LocalDate date = LocalDate.of(Integer.valueOf(tablicaDaty[0]), Integer.valueOf(tablicaDaty[1]), Integer.valueOf(tablicaDaty[2]));

            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.YYYY");
            System.out.println(String.format("Podana data po przekonwertowaniu to: %s", date.format(f)));
        } else {
            System.out.println("Podałeś złą datę");
        }


    }

}
