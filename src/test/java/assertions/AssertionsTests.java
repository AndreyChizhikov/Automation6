package assertions;

import hamcrestMathcers.OurNumberMatcher;
import models.Car;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class AssertionsTests {

    @Test
    public void AssertEqualsAndSameExamples()
    {
        Car fiatActual = new Car("red", 1.5);
        Car expected = new Car("red",1.5);

        Car secondFiatActual = fiatActual;

        Assert.assertSame(fiatActual,secondFiatActual);
        Assert.assertEquals(fiatActual, expected,"Car do not have the same parameters");
    }

    @Test
    public void AssertAssertEqualsNoOrderExample()
    {
        Integer [] actual = {1,2,3,4,5,6,7};
        Integer [] expected = {3,6,5,4,7,2,1};

        Car [] actualCars =
                {new Car("red", 1.5),
                new Car("blue", 1.5),
                new Car("red", 1.5)};

        Car [] expectedCars =
                {new Car("blue", 1.5),
                new Car("red", 1.5),
                new Car("red", 1.5)};

        Assert.assertEqualsNoOrder(actual,expected,"Integer array data is incorrect");
        Assert.assertEqualsNoOrder(actualCars,expectedCars," Car array data is incorrect");
    }

    @Test
    public void AssertAssertEqualsArrayExample()
    {
        Integer [] actual = {1,2,3,4,5,6,7};
        Integer [] expected = {1,2,3,4,5,6,7};

        Car [] actualCars =
                {new Car("red", 1.5),
                        new Car("blue", 1.5),
                        new Car("red", 1.5)};

        Car [] expectedCars =
                {new Car("red", 1.5),
                        new Car("blue", 1.5),
                        new Car("red", 1.5)};

        Assert.assertEquals(actual, expected,"Integer array data is incorrect");
        Assert.assertEquals(actualCars, expectedCars," Car array data is incorrect");
    }

    @Test
    public void AssertNotNullExample()
    {
        Car fiatActual = new Car("red", 1.5);
        Assert.assertNotNull(fiatActual, "Car is null");
    }

    @Test
    public void AssertByUsingHamcrest()
    {
        String name = "Petya";
        assertThat(name, endsWith("y"));
    }

    @Test
    public  void givenNumberWhenConditionThenCorrect()
    {
        Integer intVal = 7;
        assertThat(intVal,
                allOf(greaterThan(5),
                        lessThanOrEqualTo(7),
                        not(equalTo(6))));
    }

@Test
    public void ourMatcherTests()
{
    Integer intVal = 6;
    assertThat(intVal, OurNumberMatcher.isOurNumber());
}



}
