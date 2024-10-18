package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;


    }
    public void Username (){
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
    }

    public void Password () {
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");

    }
    public void LoginButton () {
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
    }
}