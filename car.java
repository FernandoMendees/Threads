import java.util.Random;

public class Carro implements Runnable {

    private final String name;
    private final double totalDistanceTraveled;
    private double distanceTraveled;
    private final Random random = new Random();

    public Car(String name, double totalDistanceTraveled) {
        this.name = name;
        this.totalDistanceTraveled = totalDistanceTraveled;
        this.distanceTraveled = 0;
    }

    @Override
    public void run() {
        while (distanceTraveled < totalDistanceTraveled) {
            int avanco = random.nextInt(30) + 1; // 1 a 30 metros
            distanciaPercorrida += avanco;

            if (distanceTraveled > totalDistanceTraveled) {
                distanceTraveled = totalDistanceTraveled;
            }

            System.out.println(name + " andou " + avanco
                    + " metros e já percorreu " + (int) distanceTraveled
                    + " de " + (int) totalDistanceTraveled + " metros.");

            try {
                Thread.sleep(100 + random.nextInt(401)); // 100 a 500 ms
            } catch (InterruptedException e) {
                System.out.println(nome + " foi interrompido.");
                return;
            }
        }

        System.out.println("[CHEGADA] O " + name + " cruzou a linha de chegada!");
    }
}