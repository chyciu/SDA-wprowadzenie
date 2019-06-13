package SDA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

    public class ListyDwa {

        public static void main(String[] args) {
            List<Produkt> produktList = new LinkedList<>();

            Produkt produkt1 = new Produkt("jajka", true);
            Produkt produkt2 = new Produkt("pomidory", false);

            produktList.add(produkt1);
            produktList.add(produkt2);

            System.out.println(produktList);
        }

    }
