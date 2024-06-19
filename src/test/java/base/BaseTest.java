package base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
   public WebDriver webDriver;
    @BeforeMethod
    public void initDriver()
    {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    public void quitDriver()
    {
        webDriver.quit();
    }



    @Attachment(type = "image/png")
    public byte[] takeScreenshot(WebDriver driver)
    {
        byte[] result = null;
        if(driver!=null)
        {
            result =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        }
        return result;
    }
}
