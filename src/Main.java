public class Main {

    public static void makeCatHappy(DomesticCat cat) {
        // TODO поднимите или опустите температуру в доме, чтобы код был счастлив
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            DomesticCat myCat = DomesticCat.makeRandomCat();

            makeCatHappy(myCat);

            if (myCat.isHappy()) {
                System.out.println("Cat " + i + " is happy!!! House is warm");
            } else {
                System.out.println("Cat " + i + " is not happy :(. " +
                        "House temperature " + myCat.getHouse().getTemperature() + "C is not comfortable");
            }
        }
    }
}
