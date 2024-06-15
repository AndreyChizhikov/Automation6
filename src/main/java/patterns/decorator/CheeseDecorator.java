package patterns.decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(PizzaInterface pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() +" + cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+ 3.00;
    }
}
