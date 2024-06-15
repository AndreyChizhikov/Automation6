package patterns;

import org.testng.annotations.Test;
import patterns.builder.Car;
import patterns.builder.SportCarBuilder;
import patterns.decorator.CheeseDecorator;
import patterns.decorator.PepperoniPizza;
import patterns.decorator.PizzaInterface;
import patterns.facory.CoffeeBase;
import patterns.facory.CoffeeFactory;
import patterns.facory.CoffeeType;
import patterns.singelton.Singleton;
import patterns.singelton.SingletonThreadSafe;

public class PatternsTests {

    @Test
    public void factoryTest()
    {
        CoffeeBase late = CoffeeFactory.orderCoffee(CoffeeType.LATTE);
        CoffeeBase americano = CoffeeFactory.orderCoffee(CoffeeType.AMERICANO);
    }


    @Test
    public void builderTest()
    {
         Car firstSportCar = new SportCarBuilder()
                 .withBody()
                 .withColor()
                 .withInterior()
                 .build();


        Car secondSportCar = new SportCarBuilder()
                .withBody()
                .withColor("blue")
                .withInterior()
                .build();

        Car partialSportCar = new SportCarBuilder()
                .withBody()
                .withInterior()
                .build();

        System.out.println(firstSportCar.toString());
        System.out.println(secondSportCar.toString());
        System.out.println(partialSportCar.toString());
    }

    @Test
    public void singletonTest()
    {
        Singleton singleton = Singleton.getInstance("3");
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getInstance("5");
        System.out.println(singleton2.getValue());

        SingletonThreadSafe singletonThreadSafe = SingletonThreadSafe.getInstance("6");
        System.out.println(singletonThreadSafe.getValue());
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance("2");
        System.out.println(singletonThreadSafe2.getValue());

    }

    @Test
    public void decoratorTest()
    {
        PizzaInterface pepperoniPizza = new PepperoniPizza();
        System.out.println(pepperoniPizza.getDescription() +": $" + pepperoniPizza.getCost());

        pepperoniPizza = new CheeseDecorator(pepperoniPizza);
        System.out.println(pepperoniPizza.getDescription() +": $" + pepperoniPizza.getCost());
    }

}
