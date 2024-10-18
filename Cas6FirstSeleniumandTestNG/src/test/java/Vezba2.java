import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vezba2 {
    @Test
public void test() throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");
    Thread.sleep(3000);
    //by ID
    driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id='login-button']")).click();
    Thread.sleep(3000);
    String bagpack=driver.findElement(By.xpath("//*[@class='inventory_item_name ']")).getText();
    Thread.sleep(3000);
    System.out.println(bagpack);
    driver.quit();
}
}

