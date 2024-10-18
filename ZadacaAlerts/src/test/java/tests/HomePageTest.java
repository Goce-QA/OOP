package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.BaseClass;

public class HomePageTest extends BaseClass {
    String successfulCreateMessage = "Thank you for registering with Main Website Store.";
    String alreadyCreatedMessage = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
    String requiredMessage = "This is a required field.";
    By alreadyCreated = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    By successfulCreate =By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");
    By firstNameRequired = By.xpath("//*[@id=\"firstname-error\"]");
    By lastNameRequired = By.xpath("//*[@id=\"lastname-error\"]");
    By emailRequired = By.xpath("//*[@id=\"email_address-error\"]");
    By passwordRequired = By.xpath("//*[@id=\"password-error\"]");
    By confirmPasswordRequired = By.xpath("//*[@id=\"password-confirmation-error\"]");

    @Test
    public void test1 () throws InterruptedException {
        homePage.createAccount();

       // Assert.assertEquals(driver.findElement(alreadyCreated).getText(), alreadyCreatedMessage);
        //homePage.productsBuying();
    }
}
