package patterns.facory;

public class CoffeeFactory {

    public static CoffeeBase orderCoffee(CoffeeType coffeeType)
    {
         CoffeeBase coffee = null;

         switch (coffeeType)
         {
             case LATTE -> coffee = new Latte();
             case ESPRESSO -> coffee= new Espresso();
             case AMERICANO -> coffee = new Americano();
         }

         coffee.grindCoffee();
         coffee.makeCoffee();
         coffee.pourIntoCup();

         return coffee;
    }
}
