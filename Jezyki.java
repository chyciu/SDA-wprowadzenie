package SDA;

import java.util.Optional;

public class Jezyki {

        static String jezyki[];
        static int ilosc = 0;

    public static void dodajJezyk(String jezyk) {
        if (ilosc == 0){
            jezyki = new String[10];
        }
        jezyki[ilosc++] = jezyk;
    }
    public static void main(String[] args) {

        Optional.ofNullable(jezyki).ifPresent(j -> System.out.println(j[0]));
        if (!Optional.ofNullable(jezyki).isPresent()) {
            System.out.println("puste");
        }



//        if(jezyki != null){
//            System.out.println(jezyki[0]);
//        } else {
//            System.out.println("Pusta lista");
//        }
    }


}

