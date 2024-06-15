package patterns.decorator;

public class PepperoniPizza implements PizzaInterface {
    @Override
    public String getDescription() {
        return "Pepperoni pizza";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
