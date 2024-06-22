package selenidePages.component;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenidePages.LocalisationPage;
import selenidePages.NewsPage;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {
    private final SelenideElement newsLink = $(By.xpath("//nav/a[contains(@href,'/news')]")),
                                  localisationLink = $(By.xpath("//nav/a[contains(@href,'/localisation')]"));

    public NewsPage navigateToNewsPage()
    {
        newsLink.click();
        return new NewsPage();
    }

    public LocalisationPage navigateToLocalisationPage()
    {
        localisationLink.click();
        return new LocalisationPage();
    }

}
