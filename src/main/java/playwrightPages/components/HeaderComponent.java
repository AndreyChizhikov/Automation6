package playwrightPages.components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import playwrightPages.*;

public class HeaderComponent extends BasePage {

    private final Locator newsLink =  page.locator("xpath=//nav/a[contains(@href,'/news')]"),
                  localisationLink = page.locator("xpath=//nav/a[contains(@href,'/localisation')]");

    public HeaderComponent(Page page) {
        super(page);
    }

    public NewsPage navigateToNewsPage()
    {
        newsLink.click();
        return new NewsPage(page);
    }

    public LocalisationPage navigateToLocalisationPage()
    {
        localisationLink.click();
        return new LocalisationPage(page);
    }
}
