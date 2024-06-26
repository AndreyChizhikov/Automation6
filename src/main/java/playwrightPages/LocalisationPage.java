package playwrightPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.openqa.selenium.By;
import playwrightPages.components.HeaderComponent;

public class LocalisationPage extends BasePage {
    public HeaderComponent headerComponent;
    public Locator titleText =page.locator("xpath=//h1");

    public  LocalisationPage(Page page)
    {
        super(page);
        headerComponent = new HeaderComponent(page);
    }
}
