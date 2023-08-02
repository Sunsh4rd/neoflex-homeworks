package factory;

public class CoffeeFactory {
    public static ICoffee getCoffee(CoffeeVariety coffeeVariety) {
        switch (coffeeVariety) {
            case ESPRESSO:
                return new Espresso();
            case AMERICANO:
                return new Americano();
            default: throw new IllegalArgumentException("Wrong coffee variety");
        }
    }
}
