package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.components.HeaderComponent;

public class DragAndDropPage extends BasePage {

    public HeaderComponent headerComponent;

    @FindBy(id = "box6")
    private WebElement rome;

    @FindBy(id = "box106")
    private  WebElement italy;

    public  DragAndDropPage moveRomeToItaly()
    {
        new Actions(webDriver).dragAndDrop(rome,italy).build().perform();
        return this;
    }

    public String getRomeStyleInfo()
    {
        return rome.getAttribute("style");
    }

    public DragAndDropPage(WebDriver webDriver)
    {
        super(webDriver);
        headerComponent = new HeaderComponent(webDriver);
    }


}
