package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage {
    protected static WebDriver driver;
    String userNameData = "standard_user";
    String userPasswordData = "secret_sauce";
    String firstNameData = "Goce";
    String lastNameData = "Andonoski";
    String zipCodeData = "1020";
    String purchasemessage = "Thank you for your order!";

    private By userName = By.xpath("//*[@id='user-name']");
    private By userPassword = By.xpath("//*[@type='password']");
    private By loginButton = By.xpath("//*[@id='login-button']");
    private By addToCart = By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']");
    private By goToCart = By.xpath("//*[@class='shopping_cart_link']");
    private By checkoutButton = By.xpath("//*[@id='checkout']");
    private By firstName = By.xpath("//*[@id='first-name']");
    private By lastName = By.xpath("//*[@id='last-name']");
    private By zipCode = By.xpath("//*[@id='postal-code']");
    private By continueButton = By.xpath("//*[@id='continue']");
    private By finishButton = By.xpath("//*[@id='finish']");
    private By messageAfterFinishButton = By.xpath("//*[@class='complete-header']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Username() {
        driver.findElement(userName).sendKeys(userNameData);

    }

    public void Password() {
        driver.findElement(userPassword).sendKeys(userPasswordData);

    }

    public void LoginButton() {
        driver.findElement(loginButton).click();

    }

    public void Purchase() {


        driver.findElement(addToCart).click();
        sleep(1000);
        driver.findElement(goToCart).click();
        sleep(1000);
        driver.findElement(checkoutButton).click();
        sleep(1000);
        driver.findElement(firstName).sendKeys(firstNameData);
        sleep(1000);
        driver.findElement(lastName).sendKeys(lastNameData);
        sleep(1000);
        driver.findElement(zipCode).sendKeys(zipCodeData);
        sleep(1000);
        driver.findElement(continueButton).click();
        sleep(1000);
        driver.findElement(finishButton).click();
        sleep(2000);
        Assert.assertEquals(driver.findElement(messageAfterFinishButton).getText(), purchasemessage);
        sleep(1000);
        System.out.println("\n" + "Assertion has Passed");

    }

    public void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
