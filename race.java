import java.util.ArrayList;
import java.util.List;

public class Race {

    private static final double total_distance = 1000;
    private static final int numbers_car = 5;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= NUMERO_DE_CARROS; i++) {
            Car car = new Car("Carro " + i, total_distance);
            threads.add(new Thread(car));
        }

        System.out.println("A corrida vai começar!");

        for (Thread t : threads) {
            t.start();
        }
    }
}