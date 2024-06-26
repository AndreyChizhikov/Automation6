package selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenidePages.WelcomePage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SelenideTests {

    @BeforeClass
    void setHeadless()
    {
        Configuration.headless = true;
    }

    @Test
    public void selenideTests()
    {

        String expectedTitleText = "Новини";

       open("https://prozorro.gov.ua/uk");
       $(By.xpath("//nav/a[contains(@href,'/news')]")).click();
       $(By.xpath("//section//h2")).shouldHave(text(expectedTitleText));
    }

    @Test
    public void newsPageCheckHeaderPageObject()
    {
        String expectedTitleText = "Новини";
        open("https://prozorro.gov.ua/uk");
        new WelcomePage()
                .headerComponent.navigateToNewsPage()
                .titleText.shouldHave(text(expectedTitleText));
    }

    @Test
    public void localisationPageCheckHeaderPageObject()
    {
        String expectedTitleText = "Перелік локалізованих товарів";

        open("https://prozorro.gov.ua/uk");
        new WelcomePage()
                .headerComponent.navigateToLocalisationPage()
                .titleText.shouldHave(text(expectedTitleText));
    }


}
