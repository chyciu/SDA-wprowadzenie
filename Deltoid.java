package SDA;

public class Deltoid extends FiguraGeometryczna {

    @Override
    public float powierzchnia() {
        float d1 = 5;
        float d2 = 6;
        return (0.5f*d1)*d2;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Powierzchnia rownolegloboku to: %s", powierzchnia()));
    }
}

