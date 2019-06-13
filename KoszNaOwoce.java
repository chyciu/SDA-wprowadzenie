package SDA;

import java.util.ArrayList;
import java.util.List;

public class KoszNaOwoce <T extends Owoc> {

    private List<T> koszNaOwoce = new ArrayList<>();

    public void dodajOwoc(T owoc) {
        koszNaOwoce.add(owoc);
    }

    public void pokazListeOwocow (){
        System.out.println("Owoce z koszyka: ");
        for (T owoc : koszNaOwoce) {
            System.out.println("Obiekt owocu: " + owoc);
            System.out.println("Kolor tego owocu to: " + owoc.getKolor() + "\n");
        }
    }

}
