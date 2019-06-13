package SDA;

    enum Kolor {
        ZIELONY("zielony"), NIEBIESKI("niebieski"), CZERWONY("czerwony");

        private final String kolor;
        Kolor(String kolor) {
            this.kolor = kolor;
        }

        public String getKolor() {
            return kolor;
        }
}
