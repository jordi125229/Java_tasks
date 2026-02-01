package planet;

import java.math.BigDecimal;

class PlanetTest {
    public static void main(String[] args) {
        BigDecimal density = Planet.EARTH.getDensity();
        System.out.println(density);

        Planet[] values = Planet.values();
        for (Planet value : values) {
            System.out.println(value);
        }
    }
}
