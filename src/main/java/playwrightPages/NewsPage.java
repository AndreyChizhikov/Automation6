package playwrightPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import playwrightPages.components.HeaderComponent;

public class NewsPage extends BasePage {
    public HeaderComponent headerComponent;
    public Locator titleText =page.locator ("xpath=//section//h2");

    public NewsPage(Page page){
        super(page);
        headerComponent = new HeaderComponent(page);
    }
}
