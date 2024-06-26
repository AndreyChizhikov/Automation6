package playwrightPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public abstract class BasePage {
    protected final  Page page;

    public BasePage(Page page)
    {
        this.page = page;
    }
}
