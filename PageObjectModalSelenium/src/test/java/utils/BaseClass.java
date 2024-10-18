package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

public class BaseClass {

    protected WebDriver driver;
    String url = "https://www.saucedemo.com/";
    public HomePage homePage;
    public LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        driver.get(url);
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
