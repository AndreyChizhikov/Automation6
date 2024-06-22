package selenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenidePages.component.HeaderComponent;

import static com.codeborne.selenide.Selenide.$;

public class LocalisationPage {
    public HeaderComponent headerComponent;

    public SelenideElement titleText = $(By.xpath("//h1"));

    public  LocalisationPage()
    {
        headerComponent = new HeaderComponent();
    }
}
