import java.util.Random;

/**
 * Класс домашней кошки, у котороя всегда есть дом, в котором она живет.
 */
public class DomesticCat {
    /**
     * Комфортная минимальная температура для кота.
     */
    public static int WARM_TEMPERATURE = 22;

    /**
     * Комфортная максимальная температура для кота.
     */
    public static int MAX_TEMPERATURE = 25;


    /**
     * Дом, где живет кот
     */
    private House house;


    public DomesticCat(House house) {
        this.house = house;
    }

    public boolean isHappy() {
        return house.getTemperature() >= WARM_TEMPERATURE && house.getTemperature() <= MAX_TEMPERATURE;
    }

    public House getHouse() {
        return house;
    }

    public static DomesticCat makeRandomCat() {
        House home = new House();

        DomesticCat cat = new DomesticCat(home);

        return cat;
    }

}
