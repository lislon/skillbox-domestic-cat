import java.util.Random;

/**
 * Дом, в котором живет кот. У дома, главная характеристика - его температура.
 *
 * Дом можно сделать теплее или холоднее через вызов makeWarmer и makeColder.
 */
public class House {

    private static final Random random = new Random(0);

    private int temperature; // температура в доме

    public House() {
        this.temperature = getRandomTemperature(0, 40);
    }

    public int getTemperature() {
        return temperature;
    }

    public void makeWarmer() {
        temperature++;
    }

    public void makeColder() {
        temperature--;
    }

    private static int getRandomTemperature(int from, int to) {
        return random.nextInt(to) + from;
    }
}
