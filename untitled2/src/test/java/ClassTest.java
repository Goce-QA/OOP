import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ClassTest {

    @Test
    public void test() throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        String header = driver.findElement(By.xpath("//*[@class='app_logo']")).getText();
        System.out.println(header);
    }
}

