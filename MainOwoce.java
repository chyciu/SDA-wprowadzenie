package SDA;

import java.util.ArrayList;
import java.util.List;

public class MainOwoce {

    public static void main(String[] args) {

        KoszNaOwoce<Jablko> koszJablek = new KoszNaOwoce<>();
        koszJablek.dodajOwoc(new Jablko(Kolor.ZIELONY.getKolor()));
        KoszNaOwoce<Winogrono> koszWinogron = new KoszNaOwoce<>();
        koszWinogron.dodajOwoc(new Winogrono(Kolor.ZIELONY.getKolor()));

        KoszNaOwoce<Owoc> koszOwocow = new KoszNaOwoce<Owoc>();
        koszOwocow.dodajOwoc(new Jablko(Kolor.CZERWONY.getKolor()));
        koszOwocow.dodajOwoc(new Winogrono(Kolor.ZIELONY.getKolor()));

        koszOwocow.pokazListeOwocow();

        List<String> list = new ArrayList<>();
        list.add("Darek");
        list.add("Andrzej");
        list.add("Piotr");

        pokazElementy(list, x -> x.forEach(h -> System.out.println(h)));

    }

    public static void pokazElementy(List<String> list, ShowElementsFunction elements) {
        elements.show(list);
    }
}
