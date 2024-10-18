package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUserPage {
    protected static WebDriver driver;

    private By newUserButton = By.xpath("//*[@id='newUser']");
    private By firstName = By.xpath("//*[@id='firstname']");
    private By lastName = By.xpath("//*[@id='lastname']");
    private By userName = By.xpath("//*[@id='userName']");
    private By password = By.xpath("//*[@id='password']");
    private By registerButoon = By.xpath("//*[@id='register']");

    public CreateUserPage(WebDriver driver){
        this.driver=driver;
    }

    public void newUserButton (){
        driver.findElement(newUserButton).click();
    }

    public void newUserFirstName (String newUserName){
        driver.findElement(firstName).sendKeys(newUserName);
    }

    public void newUserLastName (String newLastName) {
        driver.findElement(lastName).sendKeys(newLastName);
    }

    public void newUserName (String newUserNameData) {
        driver.findElement(userName).sendKeys(newUserNameData);
    }
    public void newUserPassword (String newPasswordData) {
        driver.findElement(password).sendKeys(newPasswordData);
    }
    public void registerButoon () {
        driver.findElement(registerButoon).click();
    }
}


