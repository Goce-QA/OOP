package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


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

    public static void text() {

        System.out.println("\n" + driver.findElement(By.xpath("//*[@class='app_logo']")).getText());

    }
}
