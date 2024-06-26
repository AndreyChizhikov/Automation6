package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.*;
import playwrightPages.WelcomePage;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PlaywrightTests {

    Playwright playwright;
    Browser browser;

    BrowserContext browserContext;
    Page page;

    @BeforeClass
    void launchBrowser()
    {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterClass
    void closeBrowser()
    {
        playwright.close();
    }

    @BeforeMethod
    void createContextAndPAge()
    {
        browserContext = browser.newContext();
        page = browserContext.newPage();
    }

    @AfterMethod
    void closeContext()
    {
       browserContext.close();
    }

    @Test
    void prozzoroPlaywrightTests()
    {
        String expectedTitleText = "Новини";

        page.navigate("https://prozorro.gov.ua/uk");
        page.locator("xpath=//nav/a[contains(@href,'/news')]").click();
        assertThat(page.locator("xpath=//section//h2")).containsText(expectedTitleText);
    }

    @Test
    public void newsPageCheckHeaderPageObject()
    {
        String expectedTitleText = "Новини";
        page.navigate("https://prozorro.gov.ua/uk");

       var titleText = new WelcomePage(page)
                .headerComponent.navigateToNewsPage()
                .titleText;
        assertThat(titleText).containsText(expectedTitleText);
    }

    @Test
    public void localisationPageCheckHeaderPageObject()
    {
        String expectedTitleText = "Перелік локалізованих товарів";

        page.navigate("https://prozorro.gov.ua/uk");
        var titleText = new WelcomePage(page)
                .headerComponent.navigateToLocalisationPage()
                .titleText;
        assertThat(titleText).containsText(expectedTitleText);
    }
}
