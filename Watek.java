package SDA;

public class Watek {


    private static Thread odliczanieDo100 = new Thread() {
        @Override
        public void run() {
            new Count0to100().count();
        }
    };

    private static Thread odliczanieDo0 = new Thread() {
        @Override
        public void run() {
            new Count100to0().count();
        }
    };

    private static Thread watek3Info = new Thread() {
        @Override
        public void run() {
            System.out.println("Processes finished!");
        }
    };

    private static Thread printInfo = new Thread() {
        @Override
        public void run() {
            for (int i = 0; i <=10000; i++) {
                System.out.println("Perma info " + i);
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
//        Thread watek0 = new Thread(printInfo);
//        watek0.setDaemon(true);
//        watek0.start();
        Thread watek1 = new Thread(odliczanieDo100);
        System.out.println("Watek pierwszy to obiekt " + watek1.toString());
        Thread watek2 = new Thread(odliczanieDo0);
        System.out.println("Watek pierwszy to obiekt " + watek2.toString());
        Thread watek3 = new Thread(watek3Info);
//        watek1.start(); // metodą start() inicjujesz wywoałanie w równoległym wątku
//        watek2.start();
//        watek2.run(); // metodą run() kod jest uruchamiany w ramach głównego wątku
        watek1.start();
        watek2.start();
        synchronized (watek3) {
            while (watek2.isAlive()) {
                System.out.println("AAA");
                watek3.wait(1);
            }
            watek3.start();
        }

        //zwróć uwagę na to, że dane uruchomione z kodu metodą run() wymieszają się z danymi z wątków
        //uruchomionych metodą start()
        //rożnica polega na tym, że metoda start() uruchamia wątek i się kończy (wynikiem jest nowy niezależny byt (wątek)
        //metoda run() jest uruchamiana bezpośrednio w głównym wątku więc działa tak jak metoda która generuje dane (kończy się z zakończeniem operacji)
    }
}
