package selenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenidePages.component.HeaderComponent;

import static com.codeborne.selenide.Selenide.$;

public class NewsPage {

    public HeaderComponent headerComponent;

    public SelenideElement titleText = $(By.xpath("//section//h2"));

    public NewsPage(){
        headerComponent = new HeaderComponent();
    }
}
