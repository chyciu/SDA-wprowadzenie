package SDA;

public class abcd {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "abcc";

        Object ab=new Object();
        Object bb = new Object();
        Object cb = ab;

        System.out.println(cb.equals(ab));
        boolean abc=(a.equals(b));
        System.out.println(abc);
    }

    public static interface OdtwarzacCD {

        public void wybierzPłyte();

        public void włóżWyjmijPłyte();
    }
}
