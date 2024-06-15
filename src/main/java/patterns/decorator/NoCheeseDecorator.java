package patterns.decorator;

public class NoCheeseDecorator  extends PizzaDecorator{
    public NoCheeseDecorator(PizzaInterface pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "without cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost()-3.00;
    }
}
