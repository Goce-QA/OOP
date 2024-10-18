package WithoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class SeleniumBasicsHomework {

    @Test
    public void test1() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Thread.sleep(2000);
        System.out.println("\n" + driver.findElement(By.xpath("//*[@class='app_logo']")).getText());

        driver.quit();
    }


    @Test
    public void test2() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        Thread.sleep(2000);
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
        driver.quit();
    }
}
