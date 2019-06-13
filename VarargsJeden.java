package SDA;

import java.util.Arrays;

public class VarargsJeden {

    public static void main(String[] args) {
        VarargsJeden main = new VarargsJeden();
        System.out.println("Srednia: " + main.parametry(1, 2,3,4,5,6));
        System.out.println("Mediana: " + main.mediana(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Max: " + main.max(2,3,4,5,6,7));
    }


    public double parametry (int argument1, int... argumenty) {
        int suma = argument1;
        for (int i = 0; i < argumenty.length; i++) {
            suma += argumenty[i];
        }
        System.out.println(suma);
        System.out.println(argumenty.length+1);

        return (double) suma / ((int)argumenty.length+1);
    }

    public static double mediana (int... argumenty) {
        double mediana = 0;
        double srednia = 0.0;
        Arrays.sort(argumenty);
        if (argumenty.length % 2 == 0)  {
            srednia = argumenty[argumenty.length/2] + argumenty[(argumenty.length/2)-1];
            mediana = srednia/2.0;

        } else {
            mediana = argumenty[argumenty.length/2];
        }

        return mediana;
      }

    public static double max (int... argumenty) {
        Arrays.sort(argumenty);
        return argumenty[argumenty.length-1];
        }

    public static double min (int... argumenty) {
        Arrays.sort(argumenty);
        return argumenty[argumenty[0]];
    }
}
