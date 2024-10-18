package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;
    public SoftAssert assertt;
    String url = "https://www.saucedemo.com";

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(url);
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        assertt = new SoftAssert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }
}
