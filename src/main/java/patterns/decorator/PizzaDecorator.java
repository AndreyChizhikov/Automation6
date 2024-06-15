package patterns.decorator;

public abstract class PizzaDecorator implements PizzaInterface {
    protected PizzaInterface pizza;

    public PizzaDecorator (PizzaInterface pizza){

        this.pizza = pizza;
    }
}
