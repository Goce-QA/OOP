package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.HomePage;


public class BaseClass {

    protected WebDriver driver;
    String url = "https://www.saucedemo.com/";
    public HomePage homePage;


    @BeforeMethod
    public void setup() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        homePage=new HomePage(driver);
        driver.get(url);
        HomePage.Username();
        HomePage.Password();
        HomePage.LoginButton();
    }
    @AfterMethod
    public void exit() {
        driver.quit();
    }

    public void sleep (int mills) {
        try{
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}