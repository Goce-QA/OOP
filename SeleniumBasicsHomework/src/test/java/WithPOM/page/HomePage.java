package WithPOM.page;

import WithPOM.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;


public class HomePage {
    protected static WebDriver driver;


      public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void Username() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    public static void Password() throws InterruptedException {
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }

    public static void LoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Thread.sleep(2000);
    }

    public static void Text() {

        System.out.println("\n"+driver.findElement(By.xpath("//*[@class='app_logo']")).getText());

    }

    public static void Purchase()throws InterruptedException {


        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='checkout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Goce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Andonoski");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("1020");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='continue']")).click();
        Thread.sleep(3000);

    }
}
