package googleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTests {

    WebDriver webDriver;

    @BeforeMethod
    public void initDriver()
    {
        webDriver = new ChromeDriver();
    }

    @AfterMethod
    public void quitDriver()
    {
        webDriver.quit();
    }

    @Test
    public void firstTest()
    {
        webDriver.get("https://mvnrepository.com/");

        var bool  = webDriver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
        Assert.assertTrue(bool,"MVN page is not opened successfully");
    }
}
