package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CreateComputerPage;
import pages.FilterComputerPage;

public class BaseClass {

    protected WebDriver driver;
    String url = "https://computer-database.gatling.io/computers";
    public CreateComputerPage createComputerPage;
    public FilterComputerPage filterComputerPage;


    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        createComputerPage = new CreateComputerPage(driver);
        filterComputerPage = new FilterComputerPage(driver);
        driver.get(url);

    }

    @AfterMethod
    public void exit(){
        driver.quit();
    }

    public void sleep(int milles){
        try {
            Thread.sleep(milles);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
