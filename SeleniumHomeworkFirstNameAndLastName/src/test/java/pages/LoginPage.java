package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected static WebDriver driver;

    private By userName = By.xpath("//*[@id='userName']");
    private By password = By.xpath("//*[@id='password']");
    private By loginButoon = By.xpath("//*[@id='login']");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void userName (String userNameData) {
        driver.findElement(userName).sendKeys(userNameData);
    }
    public void userPassword (String passwordData) {
        driver.findElement(password).sendKeys(passwordData);
    }
    public void clickButoon () {
        driver.findElement(loginButoon).click();
    }
}
