package SDA;

public class Rownoleglobok extends FiguraGeometryczna {

    @Override
    public float powierzchnia() {
        float a = 2.0f;
        float h = 4.0f;

        return a * h;

    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Powierzchnia rownolegloboku to: %s", powierzchnia()));
    }
}
