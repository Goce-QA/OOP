package pages;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginPageClass {
    WebDriver driver;
    WebDriverWait wait;
    SoftAssert assertt;
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPageClass(WebDriver driver,WebDriverWait wait,SoftAssert assertt) {
        this.driver = driver;
        this.wait = wait;
        this.assertt = assertt;

    }

    public void username(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.username)).sendKeys(username);

    }


    public void passsword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.password)).sendKeys(password);
    }

    public void loginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();

    }

    public String verifyBackpack() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"item_4_img_link\"]/img"))).getText();

    }

}
