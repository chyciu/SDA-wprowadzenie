package SDA;

public class ImieDwa {

    public static void main(String[] args) {
        String wzor = "(\\w)(\\s+)([\\.,])(\\s+)";
        String wzorFull = "(\\w)(\\s+)([\\.,])(\\s+)(\\w)(\\s+)([\\.,])(\\s+)(\\w)(\\s+)([\\.,])(\\s+)";
        String wzor2 = "(\\w)(\\s+)(\\.,)";
        String wzor3 = "(\\w)(\\s+)([\\.,])(\\s+)";
        String w = "(\\w)(\\s+)([\\.,])";
        System.out.println("1) Ala .  ma .  kota . ".replaceAll(wzor,"$1$2"));
        System.out.println("1') Ala .  ma .  kota . ".replaceAll(wzorFull,"$1$2$3$4"));
        System.out.println("2) Ala .  ma .  kota . ".replaceAll(wzor,"$1$2$3$4"));
        System.out.println("3) Ala .  ma .  kota . ".replaceAll(wzor,"$1$3$4"));
        System.out.println("4) Ala .  ma .  kota . ".replaceAll(wzor,"$1$3"));
        System.out.println("5) Ala .  ma ,  kota . ".replaceAll(wzor2,"$1"));
        System.out.println("6) Ala .  ma ,  kota . ".replaceAll(wzor3,"$1 test "));
        System.out.println("7) Ala .  ma ,  kota . ".replaceAll(wzor3,""));

    }

    public static void sprawdzWielkoscLitery(String imie, int numerLitery) {
        Character litera = imie.charAt(numerLitery);
        String pierwszaLitera = String.valueOf(litera);
        if (pierwszaLitera.equals(pierwszaLitera.toLowerCase())){
            System.out.println(String.format("Litera na indeksie %d jest pisana z małej litery!", numerLitery));
        } else {
            System.out.println(String.format("Litera na indeksie %d jest pisana z Wielkiej litery!", numerLitery));
        }
    }

    public static boolean endsWith(String imie, String literaDoSprawdzenia) {
        return String.valueOf(imie.charAt(imie.length()-1)).equalsIgnoreCase(literaDoSprawdzenia);
    }

}
