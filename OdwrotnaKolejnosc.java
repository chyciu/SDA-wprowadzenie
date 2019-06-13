package SDA;

import java.util.Scanner;

    public class OdwrotnaKolejnosc {
        public static void main(String[] args) {

            int[] tablica = new int [10];
            for (int i = 0; i <10; i++) {
                tablica[i]=i+1;
            }

            for (int i = 9; i>=0; i--)
                System.out.println("Kolejna komórka to: " + tablica[i]);

            for (int i = 0; i<=9; i++)
                System.out.println("Kolejna komórka to: " + tablica[i]);


            for (int wartosc: tablica) {
                System.out.println("Elementy tablicy " + wartosc);
            }

        }
    }

