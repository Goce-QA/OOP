package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LinksPage;


public class BaseClassLinks {
    public WebDriver driver;
    public LinksPage linksPage;
    String urllink = "https://demoqa.com/links";



    @BeforeMethod
    public void setuplinks() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        linksPage = new LinksPage(driver);
        driver.get(urllink);
    }

    @AfterMethod
    public void exit(){
        driver.quit();
    }

    public void sleep(int milles) {
        try {
            Thread.sleep(milles);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scrollDown(int pixel) {
        ((JavascriptExecutor) driver).executeScript("scroll(0," + pixel + ")");
    }
}
