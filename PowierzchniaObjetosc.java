package SDA;

public class PowierzchniaObjetosc {

    public int poleProstokata (int a, int b) {
        return a * b;
    }

        public double objetoscStozka (int promien, int wysokosc) {
        double PI = Math.PI;
        double powPromien = Math.pow(promien, 2);
            System.out.println(String.format ("Promien podstawy stożka %s ", promien));
            System.out.println(String.format("Wysokosc stożka %s ", wysokosc));
            return 1.0/3.0 * PI * powPromien * wysokosc;

    }
}
