package SDA;

public class Vessel {

    public static final String NAME = "Lady B.";
    public static final String CAPACITY = "5000 teu";
    public static final String LOA = "88 m";
    public static final String SPEED = "12 węzłów";


    public final double ZANURZENIE_MAX = 9;
    public final double ZANURZENUE_MIN = 4;

    private double predkosc;
    private String[] cargoOnBoard;

    public void sail() {
        System.out.println("Statek jest w ruchu");
    }

    public void stop() {
        System.out.println("Statek przy nabrzeżu");
    }

    private double getZanurzenie() {
        return predkosc;
    }

    public void podajZanurzenie() {
        System.out.println("Aktualne zanurzenie statku to : " + getZanurzenie());
    }

    private String[] getCargoOnBoard() {
        return cargoOnBoard;
    }

    private void setCargoOnBoard(String[] cargoOnBoard) {
        this.cargoOnBoard = cargoOnBoard;
    }

    public void zaladujTowar(String[] cargoOnBoard) {
        System.out.println("Załadowanie towarów" );

        setCargoOnBoard(cargoOnBoard);
        for (String towar : getCargoOnBoard()) {
            System.out.println("Załadowano na pokład: " + towar);
        }

    }
}
