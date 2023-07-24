package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(CoffeeVariety.AMERICANO);
        coffeeMachine.makeCoffee(CoffeeVariety.ESPRESSO);
    }
}
