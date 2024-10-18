package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CreateUserPage;
import pages.LoginPage;

public class BaseClassLogin {
    public WebDriver driver;
    public LoginPage loginPage;
    public CreateUserPage creatUserPage;
    String urllogin = "https://demoqa.com/login";
    

    @BeforeMethod
    public void setuplogin(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        creatUserPage = new CreateUserPage(driver);
        driver.get(urllogin);
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
