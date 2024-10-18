import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DomasnaXpat {
    @Test
    public void test() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("error_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='woocommerce-Button button']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='forever']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Lost your password?']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys("testing@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='reg_password']")).sendKeys("testing1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='Register']"));
        Thread.sleep(1000);
        driver.quit();
    }
}