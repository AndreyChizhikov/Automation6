package playwrightPages;
import com.microsoft.playwright.Page;
import playwrightPages.components.HeaderComponent;

public class WelcomePage extends BasePage {
    public HeaderComponent headerComponent;

    public WelcomePage(Page page)
    {
        super(page);
        headerComponent = new HeaderComponent(page);
    }
}
