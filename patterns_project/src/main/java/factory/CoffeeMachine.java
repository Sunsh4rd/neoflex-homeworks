package factory;

public class CoffeeMachine {
    public void makeCoffee(CoffeeVariety coffeeVariety) {
        ICoffee coffee = CoffeeFactory.getCoffee(coffeeVariety);
        grindCoffeeBeans();
        System.out.println("Start making a cup of fresh " + coffee.getVariety());
    }

    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans carefully");
    }
}
